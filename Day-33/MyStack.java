import java.util.NoSuchElementException;

public class MyStack {
    private int items[];

    public MyStack(int size){
        items = new int[size];
    }
    private int top = -1;
    private int count = 0;

    public void push(int value) {
        if(isFull())
            throw new RuntimeException("StackOverflowException");
        items[++top] = value;
        count++;

    }
    public void pop() {
        if(isEmpty())
            throw new RuntimeException("StackUnderflowException");
        top--;
        count--;
    }
    public int peek() {
        if(isEmpty())
           throw new NoSuchElementException();
        else
            return items[top];

    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull() {
        if(top==(items.length-1))
            return true;
        else
            return false;
    }

    public int count(){
        return count;
    }

    public void display() {
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
}
