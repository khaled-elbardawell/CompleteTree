
package completetree;

public class queue{
    queueNode front , rear;
    public  static  queueNode firstNode;

     
   public static void print(){
       for(int i = 0;i<CompleteTree.copy.length;i++){
           System.out.print("Level "+i+" >> ");
          queueNode n=CompleteTree.copy[i];
         if(n==null){
             System.out.println("empty ...");
         }else{
             while(n != null){
                 System.out.print(n.item+"  ");
                 n=n.link;
             }
         } 
           System.out.println("\n");
       }
        
     }
   
      public static void insertLast(Integer info){
         queueNode n =firstNode;
         queueNode newNode =new queueNode();
         newNode.item=info;
         newNode.link=null;
         if(n == null){
            firstNode=newNode;
             return;
         }else{
             
         while(n.link != null){
             n=n.link;
         }
         n.link=newNode;
     }
    } 
    
    public void enqueue(Object item){
        queueNode newNode=new queueNode(item,null);
        if( front == null ){
            front=rear=newNode;
        }else{
             rear.link=newNode;
             rear=rear.link;
        }
    }
    
      public treeNode dequeue(){
           treeNode item;
        if( front == null ){
            return null; 
        }else{
            item=(treeNode) front.item;
            front=front.link; 
            return item;
        }
    }
      
      public static int height(int size){
               double xx=( Math.log(size+1)/Math.log(2) ) -1;
                  int x=  (int) Math.ceil(xx);
                  return x;
      }
      
             public static void copy(){
           // copy
               int m = 0;
                int h =  queue.height(CompleteTree.arr.size());
                CompleteTree.copy=new queueNode[h+1];
                for(int i = 0;i<CompleteTree.copy.length; i++){
                   int x = (int) Math.pow(2, i);
                     for(int j=0;j<x;j++){
                           if(m < CompleteTree.arr.size() ){
                         queue.insertLast(CompleteTree.arr.get(m));
                          m++;
                             }

                          }
                    CompleteTree.copy[i]=queue.firstNode;
                    queue.firstNode=null;  


                }
    }
}

