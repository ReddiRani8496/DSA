package Hello;

public class ClassB {
    public static void main(String[] args) {
        Student student = new Student(); // calling default constructor
//        student.name = "John";
//        student.setRollNo(2); // negative
//        student.fees = 2000;
//        System.out.println(student.name); // john
//        System.out.println(student.getRollNo()); // 4
//        System.out.println(student.fees); // 0
//        student.HelloWorld();
//        final double interestRate = 0.5;
//        interestRate = 6.5;

        Student student1  = new Student();
//        Student student2 = new Student();
//        System.out.println(student2.countStudents);
        // public private protected default
        ClassB c  = new ClassB();
        c.print();
    }

    public static void hello() {

        System.out.println("hello");
    }
    public static void print(){
        hello();
        System.out.println("Hello world");
    }
}
