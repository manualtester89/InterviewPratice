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
  
  
//find Max
public int findMax(BinaryTree root){
if(root==null)return 0;
else return Math.max(findMax(root.getRight()),Math.max(findMax(root.getLeft()),root.getData()));
}

//Find a element
public boolean findElement(BinaryTree root, int findThis){
if(root==null)return false;
else return (root.getData()==findThis|| findElement(root.getLeft(),findThis)||findElement(root.getRight(),findThis));
}

//insert an element
public void insertElement(BinaryTree root, BinaryTree insertThis){
if(root==null)return;
Queue<BinaryTree> q = new LinkedList<>();
q.add(root);
while(!q.isEmpty()){
  BinaryTree temp = q.poll();
  if(temp.getLeft()!=null){
    q.add(temp.getLeft());
  }else{
    temp.setLeft(insertThis);
    return;
  }
  
  if(temp.getRight()!=null){
    q.add(temp.getRight());
  }else{
    temp.setRight(insertThis);
    return;
  }
}
}

//size of Tree
public int sizeOfTree(BinaryTree root){
if(root==null)return 0;
else return 1+ sizeOfTree(root.getLeft())+sizeOfTree(root.getRight());
}

//print in reverse Order
public void reverseOrder(BinaryTree root){
if(root==null)return;
Queue<BinaryTree> q = new LinkedList<>();
q.add(root);
Stack<BinaryTree> st = new Stack<BinaryTree>();
while(!q.isEmpty()){
  BinaryTree temp= q.poll();
  st.push(temp);
  if(temp.getRight()!=null){
    q.add(temp.getRight());
  }
  if(temp.getLeft()!=null){
    q.add(temp.getLeft());
  }
  
}
while(!st.isEmpty()){
  System.out.print(st.pop().getData()+" ");
}
}
//height of Binary Tree
public int heightOfTree(BinaryTree root){
if(root==null)return 0;
int left= heightOfTree(root.getLeft());
int right= heightOfTree(root.getRight());
if(left>right)return left+1;
else return right+1;
}

//Find  deepeest node just do level order travelsal last element is deepest node

//Find No of leaves
public int noOfLeaves(BinaryTree root){
if(root==null)return 0;
if(root.getLeft()==null && root.getRight()==null) return 1;
return noOfLeaves(root.getLeft())+ noOfLeaves(root.getRight());
}


//tree are mirror of each other 
public boolean isMirror(BinaryTree root1, BinaryTree root2){
if(root1==null && root2==null) return true;
if(root1==null||root2==null) return false;
return root1.getData()== root2.getData()&&isMirror(root1.getLeft(), root2.getRight())&& isMirror(root1.getRight(), root2.getLeft());
}

//Trees are structurially identical
public boolean isStructurical(BinaryTree root1, BinaryTree root2){
if(root1== null && root2==null)return true;
if(root1==null || root2==null)return false;
return root1.getData()== root2.getData()&&isStructurical(root1.getLeft(), root2.getLeft())&& isStructurical(root1.getRight(), root2.getRight());

}

//Max node on level
public int maxLevelNode(BinaryTree root){
if(root==null)return 0;
Queue<BinaryTree> q = new LinkedList<>();
q.add(root);
q.add(null);
int counter=0, maxCount=0;
while(!q.isEmpty()){
  BinaryTree temp = q.poll();
  if(temp==null){
    q.add(null);
    if(maxCount>counter)maxCount=counter;
  }else{
    if(temp.getLeft()!=null){
      q.add(temp.getLeft());
      counter++;
    }
    if(temp.getRight()!=null){
      q.add(temp.getRight());
      counter++;
    }
    
  }
}
return maxCount;
}  
  
  
  
}