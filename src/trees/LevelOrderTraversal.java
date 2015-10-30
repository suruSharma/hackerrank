package trees;

import java.util.*;

public class LevelOrderTraversal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  void LevelOrder(Node root)
  {
    List<Node> q = new ArrayList<Node>();
     q.add(root);
     while(!q.isEmpty()){
         Node parent = q.remove(0);
         System.out.print(parent.data + " ");
         if(parent.left!=null){
             q.add(parent.left);
         }
         if(parent.right != null){
             q.add(parent.right);
         }
     }
  }
  
}
