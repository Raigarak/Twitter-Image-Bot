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

    private Set<String> imageSet = new HashSet<>();
    private List<String> upvoteList = new ArrayList<>();
    private Set<String> resultSet = new HashSet<>();

    private int index = 0;

    ImageScraper(Config config) {
        this.config = config;
    }

    public void extractImageReddit() {
        try {
            for (String url : config.getRedditSubredditUrlList()) {
                Document doc = Jsoup.connect(url).get();
                Element siteTable = doc.selectFirst("div#siteTable");
                Elements posts = siteTable.select("div.thing");

                for (Element post : posts) {
                    //If thread is an ad, do nothing
                    if (!post.hasAttr("data-adserver-imp-pixel") || !post.hasAttr("data-adserver-impression-id")) {

                        String img = post.attr("data-url");
                        //Advertisements give weird symbol for upvote value. Prevents it from causing error, incase ads somehow get through
                        String upvotes = "";
                        Element scoreElement = post.selectFirst("div.score.unvoted");
                        upvotes = scoreElement.ownText();

                        if (!upvotes.equals("•")) {
                            upvoteList.add(upvotes);
                        } else {
                            upvoteList.add("0");
                        }

                        if(isEnoughUpvote() && !resultSet.contains(img) &&(img.endsWith(".jpg") || img.endsWith(".png"))) {
                            resultSet.add(img);
                        }
                    }
                    index++;
                }
                index = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Set<String> getImageSet() {
        return imageSet;
    }

    public List<String> getUpvoteList() {
        return upvoteList;
    }

    public Set<String> getResultSet() {
        return resultSet;
    }

    private boolean isEnoughUpvote() {
        if (Integer.parseInt(upvoteList.get(index)) >= Integer.parseInt(config.getUpvotes())) {
            return true;
        }
        return false;
    }
}
