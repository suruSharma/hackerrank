package linkedLists;

public class InsertAtHead {

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
    
    Node result = Insert(a, 7);
    
    System.out.println(result);
  }
  
  static Node Insert(Node head,int x) {
    Node input = new Node();
    input.data = x;
    input.next = head;
    return input;
}

}
