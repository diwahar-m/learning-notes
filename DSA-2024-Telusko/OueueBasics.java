public class OueueBasics {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(99);
        queue.show(); 
        queue.peek();
        
        System.out.println(queue.dequeue());
        queue.show();
    }
}
