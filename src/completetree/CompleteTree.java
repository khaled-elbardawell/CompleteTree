
package completetree;

import java.util.ArrayList;
import java.util.Scanner;


public class CompleteTree {

public static  ArrayList <Integer>arr=new ArrayList();
public static  queueNode copy[];

    public static void main(String[] args) {

         Tree t = new Tree();
        

                  while(true){
                
                    System.out.println("\n Enter (1 => insert  , 2 => print , 3 => copy , 4 => printArray , 5 => exit ) ");
                    try{
                         Scanner in = new Scanner(System.in);
                         int num = in.nextInt();

                       if(num == 1){    
                            System.out.println("please enter integer number to insert number in tree.. ");
                            Scanner input = new Scanner(System.in);
                             int x = input.nextInt();    
                              arr.add(x);
                           Tree.root = t.insertLevelOrder(arr, Tree.root,0); 
                           

                    }else if(num == 2){
                       System.out.println(" \n enter ( 1- preorder or  2- postorder or 3- inorder ,or 4- level wise ) ");
                       Scanner input = new Scanner(System.in);
                         int typePrint = input.nextInt();
                         if(typePrint == 1){
                                 t.trev("preorder", Tree.root);
                     
                         }else if(typePrint == 2){
                                 t.trev("postorder", Tree.root);
                         }else if(typePrint == 3){
                                  t.trev("inorder", Tree.root);
                         }else if(typePrint == 4){
                            t.levelWise(Tree.root);  
                            Tree.Q1=new queue();
                         }

                    }else if(num == 3){
                         queue.copy();
                
                       }else if(num == 4){
                           // print after copy
                           queue.print();
                       }else if(num == 5){
                           System.exit(0);
                       }
 
                    }catch(Exception e){
                        System.out.println("Please enter correctly !! ");
                    }
                   
        }
                       

    }
    
 
    
}



