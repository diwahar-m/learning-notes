public class OueueBasics {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.show(); 
        
        System.out.println(queue.dequeue());
        queue.show();
    }
}
