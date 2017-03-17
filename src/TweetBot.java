import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.StatusListener;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StallWarning;

public class TweetBot {
    public static void main(String[] args) throws EmptyLinkedListException {
        TwitterStream stream = new TwitterStreamFactory().getSingleton();
        StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                System.out.printf("%s tweeted %s\n", status.getUser().getScreenName(), status.getText());
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {

            }

            @Override
            public void onTrackLimitationNotice(int i) {

            }

            @Override
            public void onScrubGeo(long l, long l1) {

            }

            @Override
            public void onStallWarning(StallWarning stallWarning) {

            }

            @Override
            public void onException(Exception e) {

            }
        };
        stream.addListener(listener);
        stream.user();
    }
}

