public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(10);

        myArray.insert(10);

        myArray.insert(20);

        System.out.println(myArray.contains(10));

        myArray.insert(10);

        System.out.println(myArray.firstIndexOf(10));

        System.out.println(myArray.lastIndexOf(10));

        myArray.print();
        
    }
}