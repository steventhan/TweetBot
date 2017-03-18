import twitter4j.TwitterException;


public class TweetBot {
    public static TweetQueue tweets = new TweetQueue();

    public static void main(String[] args) throws EmptyLinkedListException, TwitterException {
        new TweetThread().start();
        new StreamThread().start();
    }

}

