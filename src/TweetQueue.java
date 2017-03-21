import twitter4j.Status;

public class TweetQueue {
    private LinkedList<Status> q;

    public TweetQueue() {
        q = new LinkedList<Status>();
    }

    public void enqueue(Status status) {
        q.push(status);
    }

    public Status dequeue() throws EmptyLinkedListException {
        return q.pop();
    }

    public Status peek() {
        return q.peek();
    }

    public Integer size() { return q.size(); }

    public Boolean isEmpty() {
        return q.size() == 0;
    }
}
