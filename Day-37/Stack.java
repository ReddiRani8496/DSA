import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int item) {
        list.add(item);
    }
    public int pop() {
        if(list.isEmpty())
            throw new EmptyStackException();
        var top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek() {
        if(list.isEmpty())
            throw new EmptyStackException();
        return list.get(list.size()-1);
    }

    public boolean find(int item) {
        int top= list.size()-1;
        while (top>0){
            if(item== list.get(top))
                return true;
            top--;
        }
        return false;
    }

    public int find1(int item) {
        int top= list.size()-1;
        while (top>=0){
            if(item== list.get(top))
                return top;
            top--;
        }
        return top;
    }
}

