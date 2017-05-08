/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    Node temp=new Node();
    temp=root;
    if(temp!=null)
        {
            System.out.print(temp.data+" ");
            preOrder(temp.left);
             preOrder(temp.right);
        }
}
