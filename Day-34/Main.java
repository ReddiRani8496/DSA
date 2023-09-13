import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//
//        System.out.println(stack.peek());
//        stack.push(50);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.isFull());
//        System.out.println(stack.count());
//        stack.display();
//        Stack s = new Stack();
//        s.push(10);
//        s.push(20);
//        System.out.println(s);

//        System.out.println(ReverseString.reverse("h"));
        System.out.println(stack.isBalanced("([])"));

    }

}
