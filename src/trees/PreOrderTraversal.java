package trees;

public class PreOrderTraversal {
  public static void main(String args[]) {
    Node root3 = new Node(3);
    Node root5 = new Node(5);
    //3 5 1 4 2 6
    Node root1 = new Node(1);
    Node root4 = new Node(4);
    Node root2 = new Node(2);
    Node root6 = new Node(6);

    root3.left = root5;
    root3.right = root2;

    root5.left = root1;
    root2.right = root4;

    root2.left = root6;

    Preorder(root3);
  }

  static StringBuffer sb = new StringBuffer();

  static void Preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data+" ");
    Preorder(root.left);
    Preorder(root.right);
  }
}
