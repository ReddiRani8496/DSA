import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStack {
    private int items[];
    TwoStack(int size) {
        items = new int[size];
        top2 = items.length;
    }
    private int top1=-1;
    private int top2;
    public void push1(int item){
        if(isFull1())
            throw new StackOverflowError();
        items[++top1] = item;
    }
    public  boolean isFull1() {
        return top1+1==top2;
    }
    public void push2(int item){
        if(isFull12())
            throw new StackOverflowError();
        items[--top2]=item;
    }
    public  boolean isFull12() {
        return top2-1==top1;
    }
    public int pop1(){
        if(isEmpty1())
            throw new EmptyStackException();
        return items[top1--];
    }
    public boolean isEmpty1() {
        return top1==-1;
    }
    public int pop2(){
        if(isEmpty2())
            throw new EmptyStackException();
        return items[top2++];
    }

    public boolean isEmpty2() {
        return top2== items.length;
    }
    public int size() {
        return top1+1+(items.length-top2);
    }

    public int peek1(){
        return items[top1];
    }
    public int peek2() {
        return items[top2];
    }

    @Override
    public String toString() {
        var x = Arrays.copyOfRange(items,0,top1+1);
        return Arrays.toString(x);

    }

    public void display2(){
        for (int i = items.length-1; i >= top2; i--) {
            System.out.println(items[i]);
        }
    }
}
