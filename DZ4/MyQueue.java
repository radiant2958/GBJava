import java.util.LinkedList;

// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
public class MyQueue {
    private LinkedList<Integer> listQueue = new LinkedList<Integer>();
    
    
    public void enqueue(int item){
        listQueue.add(item);

    }
    Integer dequeue(){
        return listQueue.pollFirst();
         
    
    }
    Integer first(){
        return listQueue.getFirst();
    }


}
