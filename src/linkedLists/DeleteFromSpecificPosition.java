package linkedLists;

public class DeleteFromSpecificPosition {

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
    
    Node result = Delete(a, 3);
    
    System.out.println(result);
  }

  static Node Delete(Node head, int position) {
  // Complete this method
    if(position ==0)
        {
        return head.next;
    }
    Node backup = head;
    Node previous = head;
    int count =0;
    while(count != position){
        count++;
        previous = backup;
        backup = backup.next;
    }
    
    previous.next = backup.next;
    backup.next = null;
    return head;

}
}
