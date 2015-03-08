public class LinkList{
    private int data;
    private LinkList next;
    
    public LinkList(int data){this.data=data; this.next=null;}
    public void SetData(int data){this.data=data;}
    public void setNext(LinkList next){this.next = next;}
    public int getData(){return data;}
    public LinkList getNext(){return next;}
    public LinkList(){this(0);}
    
  }
  
