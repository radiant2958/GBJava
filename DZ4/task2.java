// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
public class task2 {
    public static void main(String[] args) {
        MyQueue mQ=new MyQueue();
        mQ.enqueue(4);
        mQ.enqueue(6);
        mQ.enqueue(7);
        mQ.enqueue(9);
        System.out.println(mQ.first());
        System.out.println(mQ.dequeue());
        System.out.println(mQ.first());
        
    }
    
    
    
}
