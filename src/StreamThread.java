import twitter4j.*;

public class StreamThread extends Thread {
    public void run() {
        TwitterStream stream = new TwitterStreamFactory().getSingleton();
        StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                TweetBot.tweets.add(status);
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
