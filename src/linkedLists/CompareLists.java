package linkedLists;

public class CompareLists {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Node<Integer> a = new Node<Integer>(1);
    Node<Integer> b = new Node<Integer>(2);
    Node<Integer> c = new Node<Integer>(3);
    Node<Integer> d = new Node<Integer>(4);
    Node<Integer> e = new Node<Integer>(5);
    Node<Integer> f = new Node<Integer>(6);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    
    Node<Integer> a1 = new Node<Integer>(1);
    Node<Integer> b1 = new Node<Integer>(2);
    Node<Integer> c1 = new Node<Integer>(3);
    Node<Integer> d1 = new Node<Integer>(4);
    Node<Integer> e1 = new Node<Integer>(5);
    Node<Integer> f1 = new Node<Integer>(6);
    a1.next = b1;
    b1.next = c1;
    c1.next = d1;
    d1.next = e1;

    int result = CompareLists(a,a1);
    System.out.println(result);
  }

  static int CompareLists(Node<Integer> headA, Node<Integer> headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    if (headA == null && headB == null) {
      return 1;
    }
    while (headA != null && headB != null) {
      if (headA.data == headB.data) {
        headA = headA.next;
        headB = headB.next;
        continue;
      } else {
        return 0;
      }
    }

    if ((headA == null && headB != null) || (headA != null && headB == null)) {
      return 0;
    }
    return 1;
  }
}
