package linkedLists;

public class NthLastNode {

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
    
    System.out.println(GetNode(a, 2));
  }

  static int GetNode(Node<Integer> head, int n) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node<Integer> p1 = head;
    Node<Integer> p2 = head;

    int count = 0;
    while (count < n && p2 != null) {
      p2 = p2.next;
      count++;
    }

    while (p2.next != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p1.data;
  }

}
