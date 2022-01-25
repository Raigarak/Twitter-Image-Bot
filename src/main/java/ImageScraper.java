import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImageScraper {

    private Config config;

    private List<String> imageList = new ArrayList<>();
    private List<String> upvoteList = new ArrayList<>();
    private List<String> resultList = new ArrayList<>();

    private int index = 0;

    ImageScraper(Config config) {
        this.config = config;
    }

    public void extractImageWallHaven() {
        try {
            for(String url: config.getWallHavenUrlList()) {
                Document doc = Jsoup.connect(url).get();
                Elements imgElements = doc.getElementsByTag("img");
                StringBuilder sb = new StringBuilder();
                for (Element img : imgElements) {
                    String imageLink = img.attr("data-src");
                    if (imageLink.startsWith("https:")) {
                        sb.append("\"https://w.wallhaven.cc/full").append(imageLink.substring(29, 32)).append("/wallhaven-").append(imageLink.substring(33));
                        imageList.add(sb.toString());
                    }
                    sb.setLength(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void extractImage() {
        try {
            for(String url: config.getRedditSubredditUrlList()) {
                Document doc = Jsoup.connect(url).get();
                Element siteTable = doc.selectFirst("div#siteTable");
                Elements posts = siteTable.select("div.thing");

                for (Element post : posts) {
                    //If thread is an ad, do nothing
                    if (!post.hasAttr("data-adserver-imp-pixel") || !post.hasAttr("data-adserver-impression-id")) {

                        String img = post.attr("data-url");
                        if (img.startsWith("https")) {
                            imageList.add(img);
                        }

                        //Advertisements give weird symbol for upvote value. This fixes it
                        String upvotes = "";
                        Element scoreElement = post.selectFirst("div.score.unvoted");
                        upvotes = scoreElement.ownText();
                        if (!upvotes.equals("•")) {
                            upvoteList.add(upvotes);
                        } else {
                            upvoteList.add("0");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addToResultListIfValid() {
        for(String upvoteValue: upvoteList) {
           // if()
        }
    }

    public List<String> getImageList() {
        return imageList;
    }

    public List<String> getUpvoteList() {
        return upvoteList;
    }

    public List<String> getResultList() {
        return resultList;
    }
}
