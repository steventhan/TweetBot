import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import twitter4j.Twitter;

public class TweetBot {
    public static void main(String[] args) throws TwitterException {
        System.out.println("test");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus("hello world");
        System.out.println("Done.");
    }
}