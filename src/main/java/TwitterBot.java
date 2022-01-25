import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Paths;

public class TwitterBot {
    public static void main(String[] args) {

        Config config = jsonValuesIntoObject(new Config());
        ImageScraper imageScraper = new ImageScraper(config);
        imageScraper.extractImageWallHaven();
        imageScraper.extractImage();






/*
try {

            URL url = new URL("https://w.wallhaven.cc/full/pk/wallhaven-pkgkkp.png");
            BufferedImage image = ImageIO.read(url);
            ImageIO.write(image, "png", new FileOutputStream("myfil2e.jpg"));

        } catch(Exception e) {
            e.printStackTrace();
        }
        File image = new File("gang");
        image.delete();*/
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

}
