import twitter4j.TwitterException;


public class TweetBot {
    public static TweetQueue tweets = new TweetQueue();

    public static void main(String[] args) throws EmptyLinkedListException, TwitterException {
        new TweetThread().start();
        new StreamThread().start();

//        TweetQueue queue = new TweetQueue();
//        Twitter twitter = TwitterFactory.getSingleton();
//        List<Status> statuses = twitter.getHomeTimeline();
//        for (Status status : statuses) {
//            queue.enqueue(status);
//        }
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue().getText());
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue().getText());
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
    }

}

