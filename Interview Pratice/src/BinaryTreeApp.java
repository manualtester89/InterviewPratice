import java.util.LinkedList;
import java.util.Queue;
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
  
  
  //preOrderIterative
  public void preOrderIterative(BinaryTree root){
    if(root==null)  return;
    Stack<BinaryTree> st = new Stack<>();
    while(true){
      while(root!=null){
        st.push(root);
        System.out.println(root.getData());
        root =root.getLeft();
        
      }
      if(st.isEmpty()) break;
      root= st.pop();
      root= root.getRight();
    }
    
  }
  
  //post Order Traversal
  public void postOrderIterative(BinaryTree root){
    if(root==null)return;
    Stack<BinaryTree> st = new Stack<>();
    while(true){
      if(root!=null){
        st.push(root);
        root=root.getLeft();
        
      }else{
        if(st.isEmpty()) break;
        if(st.peek().getRight()==null){
          root =st.pop();
          System.out.println(root.getData());
          if(root==st.peek().getRight()){
            root=st.pop();
            System.out.println(root.getData());
          }
          if(!st.isEmpty())
          {
            root =st.peek().getRight();
          }else{
            root=null;
          }
        }
      }
    }
  }
  
  
//pratice post order traversal  
public void postOrderIterativePratice(BinaryTree root){
 if(root==null)return;
 Stack<BinaryTree> st  = new Stack<>();
 while(true){
   if(root!=null){
     st.push(root);
     root=root.getLeft();
   }else{
     if(st.isEmpty()) break;
     if(st.peek().getRight()==null){
       root= st.pop();
       System.out.println(root.getData());
       if(root== st.peek().getRight()){
        root= st.pop();
        System.out.println(root.getData());
       }
       if(!st.isEmpty()){
         root = st.peek().getRight();
       }else{
         root=null;
       }
     }
   }
 }
}
 
 //Level order Traversal
public void LevelOrderTraversal(BinaryTree root)  {
 if(root==null)return;
 Queue<BinaryTree> q = new LinkedList<BinaryTree>();
 q.add(root);
 while(!q.isEmpty()){
   BinaryTree temp = q.poll();
   System.out.println(temp.getData());
   if(temp.getLeft()!=null)
   q.add(temp.getLeft());
   if(temp.getRight()!=null)
   q.add(temp.getRight());
 }
}
  
  
  
  
  
  
}