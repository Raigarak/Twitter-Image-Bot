import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.io.File;

public class TwitterImageHandler {

    private Twitter twitter;
    private TwitterFactory tf;
    private StatusUpdate status;

    public TwitterImageHandler() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");
        status = new StatusUpdate("");
        tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }

    public Twitter getTwitter() {
        return twitter;
    }

    public TwitterFactory getTf() {
        return tf;
    }

    public void uploadImageToTwitter(File file) {
        try {
            status.media(file);
            twitter.updateStatus(status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
