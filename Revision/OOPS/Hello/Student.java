package Hello;

public class Student {

    static int countStudents; //0
    public String name;
    private int rollNo; // rollNO

    Student() {
//        this("Sam");
        this.name = "David";
        this.rollNo = 1;
        countStudents++; // 1
    }
    Student(String name) {
        this.name = name;
        this.rollNo = 20;
        System.out.println("One parameter");
    }
    Student(String name,int rollNo) {
       this.name = name;
       this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) { // argument 10
        if(rollNo<1) {
            throw new RuntimeException("Roll number must be positive and grater than zero");
        }
        this.rollNo = rollNo;
    }

    protected double fees;


    public static void print(int num) {
        System.out.println("Student Data");
    }
    public  void HelloWorld() {
        this.print(10);
        System.out.println("Student");
    }
    // sbi -> 0.5% idbi-> 1% IndianBank-> 2%

}
