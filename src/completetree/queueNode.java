
package completetree;

public class queueNode{
    Object item;
    queueNode link;
    public queueNode(){
        this(null,null);
    }
    
    public queueNode(Object item, queueNode link) {
        this.item = item;
        this.link = link;
    }
}
