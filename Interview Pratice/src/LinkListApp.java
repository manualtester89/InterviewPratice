public class LinkListApp{
  // Calculate the lenght of LinkList
  public int Length(LinkList head){
    int count=0;
    while(head!=null){
      count++;
      head=head.getNext();
    }
    return count;
  }
  // inserting element in LinkList
  public LinkList insertAt(LinkList head, LinkList insertThis, int pos){
    
    if(head==null)return insertThis;
    int length= Length(head);
    if(length < pos-1 || pos<1){
      throw new IllegalArgumentException("Postion shud be positive and atmost than length of linklist ");
    }
    else{
        if(pos==1){
          insertThis.setNext(head);
          head=insertThis;
        }else{
          int counter=1;
          LinkList current = head;
          while(counter<pos-1){
            counter ++;
            current= current.getNext();
            
          }
          insertThis.setNext(current.getNext());
          current.setNext(insertThis);
        }
    }
    return head;
  }
  
  // delete an eleemnt from LinkList
  public LinkList remove(LinkList head, int pos){
    int length = Length(head) ;
  
    if(head==null || length<pos-1 || pos<1){
      throw new IllegalArgumentException();
    }else{
        if(pos==1){
          head= head.getNext();
        }else{
          int counter =1;
          LinkList current = head;
          while(counter<pos-1){
            current=current.getNext();
            counter++;
          }
          
          current = current.getNext().getNext();
        }
      
    }
    return head;
  }
  // Get the Nth Element from the end
  public LinkList NthElement(LinkList head, int nth){
    
    LinkList first = head;
    LinkList second = head;
    int counter=1;
    
    while(first!= null){
      counter++;
      if(counter>nth){
        second=second.getNext();
      }
      first=first.getNext();
      
    }
    
    if(counter>nth)return second ;
    else return null;
  }
  
  //Find a there is cycle or not.
  public boolean isCyclePratice(LinkList head){
    LinkList first = head, second = head;
    while(first!=null){
      first=first.getNext();
      if(first==second){
        return true;
      }
      if(first==null)return false;
      first=first.getNext();
      if(first==second){
        return true;
      }
      second= second.getNext();
    }
    return false;
  }
  
  //isCycle pratice
  public boolean isCycle(LinkList head){
    LinkList first = head; LinkList second = head;
    while(first!=null){
      first=first.getNext();
      if(first==second)return true;
      if(first==null)return false;
      first= first.getNext();
      if(first==second) return true;
      second=second.getNext();
    }
    return false;
  }
  
  //isCycle pratice
  public boolean isCylce(LinkList head){
    LinkList first = head, second= head;
    
    while(first!=null){
      first= first.getNext();
      if(first==second )return true;
      if(first== null)return false;
      first=first.getNext();
      if(first==second )return true;
      second=second.getNext();
    }
    return false;
    
  }
  
//If LinkList has cycle or not if yes then find start node.
 public LinkList LoopStart(LinkList head){
   LinkList first = head, second = head;
   boolean flag =false;
   while(first!=null){
     first= first.getNext();
     if(first==second){
       flag= true;
       break;
     }
     if(first==null){
       break;
     }
     first=first.getNext();
     if(first==second){
       flag= true;
       break;
     }
     second= second.getNext();
   }
   if(flag){
     second= head;
     while(second!=first){
       second=second.getNext();
       first= first.getNext();
     }
     return first;
   }
   return null;
   
 }  
 
 // insert into sorted linklist
 public LinkList InsertList(LinkList head, LinkList insertThis){
   if(head==null || head.getData()>insertThis.getData()){
     insertThis.setNext(head);
     return insertThis;
   }
   LinkList current = head;
   LinkList prev = null;
   while(current!=null && current.getData()<insertThis.getData()){
     prev= current;
     current= current.getNext();
   }
   prev.setNext(insertThis);
   insertThis.setNext(current);
   return head;
 }
 
 //Insert into sorted linklist
 public LinkList insertLinkList(LinkList head, LinkList insertThis){
   if(head==null || head.getData()>insertThis.getData()){
     insertThis.setNext(head);
     return insertThis;
   }
   LinkList current = head;
   LinkList prev= null;
   while(current!= null && current.getData()<insertThis.getData()){
     prev = current;
     current= current.getNext();
   }
   prev.setNext(insertThis);
   insertThis.setNext(current);
   return head;
 }
 
 //Reverse LinkList
 public LinkList reverseLinkList(LinkList head){
   if(head==null)return head;
   LinkList current = head;
   LinkList temp = null;
   
   while(current!=null){
     LinkList next = current.getNext();
     current.setNext(temp);
     temp= current;
     current= next;
   }
   return temp;
 }
 
 // reverse linklist recursively
 public LinkList reverseRecursively(LinkList head){
   if(head==null)return head;
   return reverseRecursivelyUtil(head, null);
 }
 
 public LinkList reverseRecursivelyUtil(LinkList head, LinkList next){
   if(head==null)return next;
   LinkList nextOne = head.getNext();
   head.setNext(next);
   return reverseRecursivelyUtil(nextOne, head);
 }
 
 //Find the joint node
 public LinkList jointNode(LinkList head1, LinkList head2){
   int l1 = Length(head1);
   int l2 = Length(head2);
   int diff = l1-l2;
   if(diff<0){
     LinkList temp = head2;
     head2= head1;
     head1=temp;
     diff= -diff;
   }
   
   while(diff<0){
     head1= head1.getNext();
     diff--;
   }
   while(head1 == null || head2==null){
     if(head1==head2)return head1;
     head1=head1.getNext();
     head2= head2.getNext();
   }
   return null;
 }
 
 
 // Middle Element of LinkList
 public LinkList middle(LinkList head){
   LinkList first=head, second=head;
   boolean flag = true;
   while(first.getNext()!=null){
     if(flag){
       first= first.getNext();
       flag = false;
     }
     else if(!flag){
       first= first.getNext();
       second= second.getNext();
       flag=true;
     }
   }
   return second;
 }
 
 //print LinkList in reverse Order
 public void reverseOrder(LinkList head){
   if(head==null){
     return;
   }
   else{
     reverseOrder(head.getNext());
     System.out.println(head.getData());
   }
 }
 
 //LinkList even or Odd
 public int isLinkListOdd(LinkList head){
   while(head!=null && head.getNext()!=null){
     head= head.getNext().getNext();
   }
   if(head==null)return 0;
   return 1;
 }
 
 //LinkList even or odd
 public int isLinkListOddPratice(LinkList head){
   while(head!=null && head.getNext()!=null){
     head= head.getNext().getNext();
   }
   if(head == null)return 0;
   return 1;
 }
 
 //Merge two LinkList
 public LinkList MergeLinkList(LinkList A, LinkList B){
   if(A== null)return B;
   if(B==null)return A;
   LinkList newNode;
   if(A.getData()>B.getData()){
     newNode = A;
     newNode.setNext(MergeLinkList(A,B.getNext()));
   }else{
     newNode=B;
     newNode.setNext(MergeLinkList(A.getNext(), B));
   }
   return newNode;
 }
 //LinkList merge
 public LinkList Merge(LinkList A, LinkList B){
   if(A==null)return B;
   if(B==null)return A;
   LinkList newNode;
   if(A.getData()>B.getData()){
     newNode=A;
     newNode.setNext(Merge(A,B.getNext()));
   }else{
     newNode = B;
     newNode.setNext(Merge(A.getNext(),B));
   }
   return newNode;
 }
 
//pariwise reversal
 public LinkList pairWiseReversal(LinkList head){
   if(head==null|| head.getNext()==null){
     return null;
   }
   LinkList temp = head.getNext();
   head.setNext(temp.getNext());
   temp.setNext(head);
   return pairWiseReversal(head.getNext());
 }
 
 public LinkList pairwiseRecursive(LinkList head){
   if(head==null|| head.getNext()==null){
     return null;
   }
   LinkList temp = head.getNext();
   head.setNext(temp.getNext());
   temp.setNext(head);
   pairwiseRecursive(head.getNext());
   return temp;
   
 }
 
 public LinkList pairwiseIterative(LinkList head){
   LinkList temp;
   LinkList current = head;
   while(current!=null && current.getNext()!=null){
     temp=current.getNext();
     current.setNext(temp.getNext());
     temp.setNext(current);
     current=current.getNext();
   }
   return head;
 } 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}