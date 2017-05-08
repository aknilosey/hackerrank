/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
   
        Node head=root;
       
        Stack<Integer> stack=new Stack<Integer>();
                    
        while(root!=null)
            {
                 stack.push(root.data);
                    root=root.left;
            }
        while(!stack.isEmpty())
            {
               
                int a=stack.pop();
            System.out.print(a+" ");
            }
        
        root=head;
         while(root.right!=null)
            {
                  System.out.print(root.right.data+" ");
                    root=root.right;
            }
       
     
 
    
}