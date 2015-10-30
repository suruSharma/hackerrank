package linkedLists;

/**
 * 
 * @author Suruchi
 *
 * @param <T>
 */
public class Node<T> {
  T data;
  Node<T> next;

  public Node(T data){
    this.data = data;
  }
  
  public Node(){
    
  }
  
  public void appendToTail(T d){
    Node<T> node = new Node<T>(d);
    Node<T> n = this;
    while(n.next != null){
      n = n.next;
    }
    n.next = node;
  }
  
  public Node<T> deleteNode(Node<T> head, T d){
    Node<T> n = head;
    if(n.data == d){
      //delete the first one
      return head.next;
    }else{
      while(n.next != null){
        if(n.next.data == d){
          n.next = n.next.next;
          return head;
        }
        n = n.next;
      }
    }
    
    return head;
  }

  @Override
  public String toString(){
    Node<T> n = this;
    StringBuffer sb = new StringBuffer();
    while(n!=null){
      sb.append(n.data+"->");
      n = n.next;
    }
    sb.setLength(sb.length() - 2);
    
    return sb.toString();
  }
  
  public void addToNode(T data) {
    Node<T> end = new Node<T>(data);

    Node<T> n = this;

    while (n.next != null) {
      n = n.next;
    }

    n.next = end;
  }
  
  void addNewNode(Node<T> newNode) {
    Node<T> n = this;

    while (n.next != null) {
      n = n.next;
    }

    n.next = newNode;
  }
  
}
