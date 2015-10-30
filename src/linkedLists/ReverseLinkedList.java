package linkedLists;

public class ReverseLinkedList {

  public static void main(String[] args) {
    Node<Integer> a = new Node<Integer>(1);
    Node<Integer> b = new Node<Integer>(2);
    Node<Integer> c = new Node<Integer>(3);
    Node<Integer> d = new Node<Integer>(4);
    Node<Integer> e = new Node<Integer>(5);
    Node<Integer> f = new Node<Integer>(6);
    a.next = b;
    b.next = c;
    c.next = d;/*
                * d.next = e; e.next = f;
                */
    Node<Integer> result = reverseList(a);
    System.out.println(result);
  }

  static Node<Integer> reverseList(Node<Integer> head) {
    if (head == null || head.next == null)
      return head;

    Node<Integer> p1 = head;
    Node<Integer> p2 = head.next;
    
    head.next = null;
    
    while(p1 != null && p2 != null){
      Node<Integer> t = p2.next;
      p2.next = p1;
      p1 = p2;
      if(t == null){
        break;
      }
      else{
        p2 = t;
      }
    }
    
    return p2;
  }

}
