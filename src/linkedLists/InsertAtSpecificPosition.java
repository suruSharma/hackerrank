package linkedLists;

public class InsertAtSpecificPosition {

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
    
    Node result = InsertNth(a, 7, 3);
    
    System.out.println(result);
  }
  
  static Node InsertNth(Node head, int data, int position) {
    Node input = new Node();
    input.data = data;
    if(position ==0){
        input.next = head;
        return input;
    }
    Node backup = head;
    int count = 0;
    Node previous = new Node();
    while(count != position){
        previous = backup;
        backup = backup.next;
        count++;
    }
    previous.next = input;
    input.next = backup;
    return head;
}

}
