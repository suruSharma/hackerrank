package linkedLists;

public class RemoveDuplicatesFromLL {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Node<Integer> a = new Node<Integer>(1);
    Node<Integer> b = new Node<Integer>(1);
    Node<Integer> c = new Node<Integer>(1);
    Node<Integer> d = new Node<Integer>(1);
    Node<Integer> e = new Node<Integer>(1);
    Node<Integer> f = new Node<Integer>(1);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    
    Node<Integer> result = RemoveDuplicates(a);
    System.out.println(result);
  }
  
  static Node<Integer> RemoveDuplicatesRight(Node<Integer> head) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 

      if(head == null){
          return null;
      }
      Node<Integer> p1 = head;
      Node<Integer> p2 = head.next;
      
      while(p2 != null){
          if(p1.data == p2.data){
              p1.next = p2.next;
              p2 = p2.next;
              continue;
          }
          p1 = p2;
          p2 = p2.next;
      }
      
      return head;
  }
  
  static Node<Integer> RemoveDuplicates(Node<Integer> head) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 

      if(head == null){
          return null;
      }
      Node<Integer> p1 = head;
      Node<Integer> p2 = head.next;
      
      while(p2.next != null){
          if(p1.data == p2.data){
              p1.next = p2.next;
              p2 = p1.next.next;
              p1 = p1.next;
              continue;
          }
          p1 = p1.next;
          p2 = p2.next;
      }
      
      return head;
  }

}
