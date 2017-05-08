/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
   HashSet<Node> firstcommonnode=new HashSet<Node>();
    while(headA.next!=null)
        {
          firstcommonnode.add(headA);
          headA=headA.next;
        }
    while(headB.next!=null)
        {
            if(firstcommonnode.contains(headB)) return headB.data;
            else
                headB=headB.next;
        }
    return headB.data;
}
