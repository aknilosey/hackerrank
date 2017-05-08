/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node temp=new Node();
    Node slow=new Node();
    if(head.next==null)
        return head;
    else{
    while(head!=null)
        {
            temp=head.next;
            head.next=head.prev;
            head.prev=temp;
            slow=head;
            head=temp;
        }
    return slow;
    } 
 
        

}

