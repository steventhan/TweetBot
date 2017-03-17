public class LinkedList <T> {
   public Node<T> head;
   public Node<T> tail;

   public LinkedList() {
      head = null;
      tail = null;
   }

   public void push(T data) {
      Node<T> n = new Node<>(data);
      n.next = head;
      if (head == null && tail == null) {
        head = tail = n;
        return;
      }
      head.prev = n;
      head = n;
   }

   public T pop() {
      Node new_tail = tail.prev;
      T data = tail.data;
      new_tail.next = null;
      tail = new_tail;
      return data;
   }

   public T peek() {
      return tail.data;
   }

   private static Integer getSize(Node n) {
       if (n == null) {
          return 0;
       }
       return 1 + getSize(n.next);
   }

   public Integer size() {
       return getSize(head);
   }
}

class Node <T> {
   T data;
   Node prev;
   Node next;

   public Node(T data) {
      this.data = data;
      this.prev = null;
      this.next = null;
   }
}
