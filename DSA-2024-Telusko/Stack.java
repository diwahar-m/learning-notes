public class Stack {
    private int[] arr = new int[5];
    int top;
    int size;

    public Stack(){
        size = arr.length;
        top=-1;
    }

    public void push(int data){ 
        if(top< size){
            arr[++top] = data; // pre increment 
        } else if(top>= size){
            System.out.println("Stack Overfllow");
        }
    } 

    public int pop(){
        if(top<-1)
            return arr[top--]; // post decrement 
        else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public void printStack(){
        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
