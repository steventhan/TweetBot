import twitter4j.Status;

import java.util.Queue;

public class TweetThread extends Thread {
    public void run() {
        while (true) {
            Queue<Status> tweets = TweetBot.tweets;
            while (!tweets.isEmpty()) {
                Status tweet = tweets.remove();
                System.out.printf("%s tweeted %s", tweet.getUser().getScreenName(), tweet.getText());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
