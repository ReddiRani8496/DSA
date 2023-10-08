public class Stack {
    public static void main(String[] args) {
        StackWithTwoQueues stack = new StackWithTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
         System.out.println(stack);
         stack.pop();
         System.out.println(stack);
         System.out.println(stack.peek());
         stack.pop();
         System.out.println(stack);
         System.out.println(stack.size());
     }
}
