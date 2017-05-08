   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
      int LevelOrder(Node root)
    {
      Node temp=new Node();
          temp=root;
     Queue queue=new LinkedList();
      while(root!=null)
          {
                if(temp==root)
                    {
                    System.out.print(root.data+" ");

                    }
            // System.out.print(root.data+" ");
                if(root.left==null && root.right==null)
                    {
                    //System.out.print("B");
                    return 0;
                    }
                else if(root.left==null & root.right!=null)
                    {
                        System.out.print(root.right.data+" ");
                        root=root.right;
                    }
               else if(root.left!=null & root.right==null)
                    {
                        System.out.print(root.left.data+" ");
                        root=root.left;
                    }
               else if(root.left!=null & root.right!=null)
               {
                   //System.out.print("A");
                   System.out.print(root.left.data+" ");
                   System.out.print(root.right.data+" ");
                   queue.add(root.left);
                   queue.add(root.right);
                   root=(Node)queue.remove();
                   
               }
                   
      }
      return 0;
    }