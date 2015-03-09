public class BinaryTree{
 
 private int data;
 private BinaryTree right;
 private BinaryTree left;
  
  public BinaryTree(int data){
    this.data= data;
    this.right= null;
    this.left=null;
    
  }
  
  public int getData(){return data;}
  public void setData(int data){this.data=data;}
  
  public BinaryTree getLeft(){return this.left;}
  public void setLeft(BinaryTree left){this.left= left;}
  
  public BinaryTree getRight(){return this.right;}
  public void setRight(BinaryTree right){this.right=right;}
}