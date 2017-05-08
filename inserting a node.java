/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    Node tmp=new Node();
    tmp.data=data;
    tmp.next=null;

    if(head==null)
        {
          head=tmp;
        return(head);
        }
    else
        {
            Node s=new Node();
            s=head;
              while(s.next!=null)
                { 
                   s=s.next;
                 }
                 s.next=tmp;
           return(head);
    }
}
