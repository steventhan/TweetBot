import twitter4j.Status;

import java.util.*;
import java.util.LinkedList;

public class TweetBot {
    static Queue<Status> tweets = new LinkedList<>();

    public static void main(String[] args) throws EmptyLinkedListException {
        TweetThread tweetThread = new TweetThread();
        tweetThread.start();
        StreamThread streamThread = new StreamThread();
        streamThread.start();
    }

}

