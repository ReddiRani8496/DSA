public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(10);

        myArray.insert(50);

        myArray.insert(20);

        myArray.sort();

        myArray.print();

        myArray.subList(1,1);
    }
}