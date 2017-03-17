import twitter4j.Status;

public class TweetQueue {
    private LinkedList<Status> Q;

    public TweetQueue() {
        Q = new LinkedList<Status>();
    }

    public void enqueue(Status status) {
        Q.push(status);
    }

    public Status dequeue() {
        return Q.pop();
    }

    public Status peek() {
        return Q.peek();
    }

    public Boolean isEmpty() {
        return Q.size() == 0;
    }
}
