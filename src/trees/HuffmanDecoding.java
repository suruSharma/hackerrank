package trees;

class HuffmanNode{
  int freq;
  char data;
  HuffmanNode left;
  HuffmanNode right;
}
public class HuffmanDecoding {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   
    HuffmanNode root = new HuffmanNode();
    root.data = '\0';
    root.freq = 5;
    
    HuffmanNode A = new HuffmanNode();
    A.data = 'A';
    A.freq = 3;
    
    root.right = A;
    
    HuffmanNode blank = new HuffmanNode();
    blank.data = '\0';
    blank.freq = 2;
    root.left = blank;
    
    HuffmanNode B = new HuffmanNode();
    B.data = 'B';
    B.freq = 1;
    blank.left = B;
    
    HuffmanNode C = new HuffmanNode();
    C.data = 'C';
    C.freq = 1;
    
    blank.right = C;
    
    decode("1001011",root);
    
  }

  /*
   *   {\0,5}
    0 /     \ 1
   {\0,2}   {A,3}
  0/   \1
{B,1}  {C,1}  
   */
  
 static void decode(String S ,HuffmanNode root)
  {
      char[] arr = S.toCharArray();
      HuffmanNode backup = root;
      for(int i=0;i<arr.length;i++){
          if(arr[i] == '1'){
              backup = backup.right ;
          }
          else{
              backup = backup.left;
          }
          if(backup.left == null && backup.right == null){
            System.out.print(backup.data);
            backup = root;
          }
      }

     
  }
}
