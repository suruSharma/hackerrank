package linkedLists;

public class PrintElements {

  public static void main(String[] args) {
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
    
    Print(a);
  }

  static void Print(Node head) {
    if(head == null){
        return;
    }else{
          while(head != null){
            System.out.println(head.data);
              head = head.next;
          }
      }
    
  }
}
