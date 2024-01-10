public class ExceptionHandling {
    public static void main(String[] args) {
        String s = null;
      //  System.out.println(s.length()); null pointer exception will get
       // System.out.println(10/0); Arithmetic exception
        int a = 10;
        int b = 0;
        try {
            System.out.println("Try block");
            System.out.println(divide(a, b));
            factorial(2);
        }
//        } catch (Exception e) {
//            System.out.println("Excetpion");
//        }
        catch (DivideByZeroException e) {
            System.out.println("Cannot divide a number with 0");
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Division performed");
    }

    private static int factorial(int n) throws NegativeNumberException{
        if(n<0)
            throw new NegativeNumberException();
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int divide(int a, int b) throws DivideByZeroException{
        if(b==0)
            throw new DivideByZeroException();
            //throw new ArithmeticException();
        return a/b;
    }

}
