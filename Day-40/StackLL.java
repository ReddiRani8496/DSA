import java.util.EmptyStackException;
import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class StackLL {
    Node top;
    int size;
    int size1;

    StackLL(int size) {
        this.size = size;
    }
    public void push(int item) {
        if(isFull())
            throw new StackOverflowError();
        Node node = new Node(item);
        node.next = top;
        top = node;
        size1++;
    }
    public int pop() {
        if(isEmpty())
            throw new EmptyStackException();
        var temp = top.data;
        top = top.next;
        size1--;
        return temp;
    }

    public int peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty() {
        return  top==null;
    }
    public int size() {
        return size1;
    }
    public boolean isFull() {
        return size()==size;

    }

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<Character>();
        int middle = str.length()/2;
        int count = 0;
        while (count<middle) {
            stack.push(str.charAt(count));
            count++;
        }
        if(str.length()%2!=0) {
            count++;
        }
        while (!stack.isEmpty()) {
            if(stack.pop()!=str.charAt(count))
                return false;
            count++;
        }

        return true;
    }

}
