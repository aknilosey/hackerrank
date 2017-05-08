/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    int count=0;
      for(Node no=head;no.next!=null;no=no.next)
          {
             count++;
          }
   int temp=count-n-1;
    //return count;
    for(int i=0;i<=temp;i++)
        {
          head=head.next;
        }
    return head.data;

}
