import WallHaven.WallHavenArray;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TwitterBot {
    public static void main(String[] args) {
        Set<String> allImages = new HashSet();
        Set<String> alreadyPrinted = new HashSet<>();
        //Retrieves all the images from the list of subreddit's and adds them into the set
        Config config = jsonValuesIntoObject(new Config());
        ImageScraper imageScraper = new ImageScraper(config);
        imageScraper.extractImageReddit();
        allImages.addAll(imageScraper.getResultSet());
        //Retrieves all the images from the list of wallHaven api's and adds them into the set
        getWallHavenURL(config, allImages);

        TwitterImageHandler twitterHandler = new TwitterImageHandler();


        while (true) {
            try {
                for (String urlLink : allImages) {
                    if (!alreadyPrinted.contains(urlLink)) {
                        //Downloads the current image url of the list
                        URL url = new URL(urlLink);
                        BufferedImage image = ImageIO.read(url);
                        File file = new File("image.jpg");
                        ImageIO.write(image, "jpg", file);

                        //Upload image to twitter
                        twitterHandler.uploadImageToTwitter(file);

                        //Delete image that was just downloaded
                        file.delete();
                        TimeUnit.MINUTES.sleep(30);
                    }
                    alreadyPrinted.add(urlLink);
                }
                //Update list with new images
                imageScraper.extractImageReddit();
                allImages.addAll(imageScraper.getResultSet());
               getWallHavenURL(config, allImages);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Config jsonValuesIntoObject(Config config) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("Config.json");
        try {
            config = objectMapper.readValue(file, Config.class);
            return config;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return config;
    }

    public static void getWallHavenURL(Config config, Set<String> allImages) {

        for(String url: config.getWallHavenUrlList()) {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                ObjectMapper mapper = new ObjectMapper();
                WallHavenArray wallHaven = mapper.readValue(response.body(), new TypeReference<WallHavenArray>() {
                });
                allImages.addAll(wallHaven.getAllImages());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    }