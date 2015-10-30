package linkedLists;

import java.util.ArrayList;
import java.util.List;

public class PrintInReverse {

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
    
    ReversePrint(a);
    
  }
  
  static void ReversePrint(Node<Integer> head) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
      List<Integer> results = new ArrayList<Integer>();
      while(head != null){
          results.add(head.data);
          head = head.next;
      }
      
      for(int i = results.size()-1;i>=0;i--){
          System.out.println(results.get(i));
      }

  }

}
