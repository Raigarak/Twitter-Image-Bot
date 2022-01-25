import java.util.Arrays;
import java.util.List;

public class Config {

    private String upvotes;
    private String[] redditSubredditUrlList;
    private String[] wallHavenUrlList;

    public Config(String upvotes, String[] redditSubredditUrlList, String[] wallHavenUrlList) {
        this.upvotes = upvotes;
        this.redditSubredditUrlList = redditSubredditUrlList;
        this.wallHavenUrlList = wallHavenUrlList;
    }

    public Config() {

    }

    public String getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(String upvotes) {
        this.upvotes = upvotes;
    }

    public String[] getRedditSubredditUrlList() {
        return redditSubredditUrlList;
    }

    public void setRedditSubredditUrlList(String[] redditSubredditUrlList) {
        this.redditSubredditUrlList = redditSubredditUrlList;
    }

    public String[] getWallHavenUrlList() {
        return wallHavenUrlList;
    }

    public void setWallHavenUrlList(String[] wallHavenUrlList) {
        this.wallHavenUrlList = wallHavenUrlList;
    }

    @Override
    public String toString() {
        return "Config{" +
                "upvotes='" + upvotes + '\'' +
                ", redditSubredditUrlList=" + Arrays.toString(redditSubredditUrlList) +
                ", wallHavenUrlList=" + Arrays.toString(wallHavenUrlList) +
                '}';
    }
}
