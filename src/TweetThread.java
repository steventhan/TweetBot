import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class TweetThread extends Thread {
    @Override
    public void run() throws EmptyLinkedListException {
        while (true) {
            TweetQueue tweets = TweetBot.tweets;
            while (!tweets.isEmpty()) {
                try {
                    response(tweets.dequeue());
                } catch (TwitterException te){
                    te.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    private static void response(Status tweet) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.updateStatus(String.format("@%s %s", tweet.getUser().getScreenName(), tweet.getText()));
    }
}
