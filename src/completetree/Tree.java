/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completetree;

import java.util.ArrayList;



    class Tree { 
           public static treeNode root=null; 
           public static queue Q1= new queue();



                public treeNode insertLevelOrder(ArrayList arr, treeNode root,int i) { 
                   // Base case for recursion 
                   if (i < arr.size()) { 
                           treeNode temp = new treeNode((int) arr.get(i)); 
                           root = temp; 

                           // insert left child 
                           root.left = insertLevelOrder(arr, root.left, 2 * i + 1); 

                           // insert right child 
                           root.right = insertLevelOrder(arr, root.right, 2 * i + 2); 
                   } 
                   return root; 
           } 

            public void visit(int x){
             System.out.print(x+" "+" ");
         }
                  
                  

        public void trev(String name,treeNode t){
          if(t!=null){
              if(name.equals("preorder")){
                visit(t.info);  
                trev("preorder",t.left);
                trev("preorder",t.right);
              }
              else  if(name.equals("postorder")){  
                trev("postorder",t.left);
                trev("postorder",t.right);
                visit(t.info);  
              } else if(name.equals("inorder")){
                 trev("inorder",t.left);
                 visit(t.info);  
                 trev("inorder",t.right);
              }else{
                  System.out.print("null");
              }
            
          }
       }
        
          public static void levelWise(treeNode T){
            treeNode n;
            Q1.enqueue(T);
            while (Q1!=null){
                n= Q1.dequeue();
                String z="";
                if(n!=null){
                      
                   z = n.info+"\t";    
                     
                    
                    System.out.print(z);
                    Q1.enqueue(n.left);
                    Q1.enqueue(n.right);

                }else {
                    return ;
                }
                
            
            }
          }




   } 
