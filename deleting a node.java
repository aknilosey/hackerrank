/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node temp=new Node(); 
    Node right=new Node();
    //temp=head;
    if(position==0)
        {
           temp=head.next;
           head=temp;
        return(head);
        }
    else
        {
         temp=head;
          for(int i=0; i<position-1; i++)
              {
                 //right Node=new Node();
                temp=temp.next;
              }
              right=temp.next;
              temp.next=right.next;
        return(head);
}
}
