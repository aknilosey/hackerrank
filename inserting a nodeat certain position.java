/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
     Node temp=new Node();
      temp.data=data;
    Node right=new Node();
    right=head;
    if(head==null)
        {
           head=temp;
           return(head);
        }
    else if(position==0)
        {
           temp.next=head;
           head=temp;
        return(head);
        }
    else
        {
          for(int i=0; i<position-1; i++)
              {
                 //right Node=new Node();
                right=right.next;
              }
              temp.next=right.next;
              right.next=temp;
            return(head);
        }
    
    
}
