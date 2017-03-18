
public class SinglyLinkedList <T> {
    public INode head;

    public SinglyLinkedList() {
        head = null;
    }

    public void push(Integer n) {
        INode node = new INode(n);
        node.next = head;
        head = node;
    }

    public SinglyLinkedList removeEvens() throws EmptyLinkedListException {
        SinglyLinkedList evenList = new SinglyLinkedList();
        evenList.head = head;
        try {
            this.head = evenList.head.next;
        } catch (NullPointerException e) {
            throw new EmptyLinkedListException("Empty Linked list");
        }
        INode cur = evenList.head;
        INode temp;
        while (cur != null) {
            temp = cur.next;
            try {
                cur.next = cur.next.next;
            } catch (NullPointerException e) {}
            cur = temp;
        }
        return evenList;
    }
}

class INode {
    Integer data;
    INode next;

    public INode(Integer n) {
        this.data = n;
        this.next = null;
    }
}

