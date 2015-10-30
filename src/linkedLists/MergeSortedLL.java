package linkedLists;

public class MergeSortedLL {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Node<Integer> a = new Node<Integer>(1);
    Node<Integer> b = new Node<Integer>(3);
    Node<Integer> c = new Node<Integer>(5);
    Node<Integer> d = new Node<Integer>(6);
    a.next = b;
    b.next = c;
    c.next = d;

    Node<Integer> a1 = new Node<Integer>(2);
    Node<Integer> b1 = new Node<Integer>(4);
    Node<Integer> c1 = new Node<Integer>(7);
    a1.next = b1;
    b1.next = c1;

    Node<Integer> result = MergeLists(a, a1);
    System.out.println(result);

  }

  static Node<Integer> MergeLists(Node<Integer> headA, Node<Integer> headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node<Integer> result = null;

    while (headA != null && headB != null) {
      Node<Integer> temp = new Node<Integer>();
      if (headA.data < headB.data) {
       temp.data = headA.data;
       result = addToTail(result, temp);
       headA = headA.next;
      } else {
        temp.data = headB.data;
        result = addToTail(result, temp);
        headB = headB.next;
      }
    }

    if (headA == null && headB != null) {
      result = addToTail(result, headB);
    } else if (headA != null && headB == null) {
      result = addToTail(result, headA);
    }

    return result;
  }

  static Node<Integer> addToTail(Node<Integer> head, Node<Integer> tail) {
    if (head == null) {
      head = tail;
    } else {
      Node<Integer> backup = head;
      while (backup.next != null) {
        backup = backup.next;
      }
      backup.next = tail;
    }

    return head;
  }

}
