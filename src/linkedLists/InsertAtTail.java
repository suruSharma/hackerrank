package linkedLists;

public class InsertAtTail {

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
    
    Insert(a, 7);
    
    System.out.println(a);

  }

  @SuppressWarnings({ "unchecked", "unchecked" })
  static Node<Integer> Insert(Node<Integer> head,int data) {
 // This is a "method-only" submission. 
 // You only need to complete this method. 
     Node<Integer> backup = head;
   while(backup.next != null){
       backup = backup.next;
   }
     Node<Integer> input = new Node<Integer>();
     input.data = data;
     input.next = null;
     backup.next = input;
     return head;
 }

  
}
