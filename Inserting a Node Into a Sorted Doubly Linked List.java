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

Node SortedInsert(Node head,int data) {
    Node n = new Node();
    n.data = data;
    if (head == null) {
        head=n;
        return head;
    }
    else if (head.data>data) {
        n.next = head;
        head.prev = n;
        return n;
    }
    else {
        head.next = SortedInsert(head.next, data);
        head.next.prev = head;
        return head;
    }
}
