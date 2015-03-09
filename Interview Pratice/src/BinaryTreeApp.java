import java.util.Stack;

public class BinaryTreeApp{
  
  //inOrder Traversal
  public void inOrder(BinaryTree root){
    if(root==null)return;
    inOrder(root.getLeft());
    System.out.println(root.getData());
    inOrder(root.getRight());
  }
  
  //preOrder Traversal
  public void preOrder(BinaryTree root){
    if(root==null)return;
    System.out.println(root.getData());
    preOrder(root.getLeft());
    preOrder(root.getRight());
  }
  
  //postOrderTraversal
  public void postOrder(BinaryTree root){
    if(root==null)return;
    postOrder(root.getLeft());
    postOrder(root.getRight());
    System.out.println(root.getData());
  }
  
  public void inOrderIterative(BinaryTree root){
    if(root==null)  return;
    Stack<BinaryTree> st = new Stack<>();
    
    while(true){
      while(root!=null){
        st.push(root);
        root=root.getLeft();
      }
      if(st.isEmpty())break;
      
      root = st.pop();
      System.out.println(root.getData());
      root=root.getRight();
    }  
  }
  
  
  
  
  
  
  
  
  
  
}