/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/


boolean hasCycle(Node head) {
    if (head == null) return false;
    Node fast=new Node();
    Node slow=new Node();
    fast=head;
    slow=head;
    
    while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast)
               {return true;}
            
        }
    return false;
}
