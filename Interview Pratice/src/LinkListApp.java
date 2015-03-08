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
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}