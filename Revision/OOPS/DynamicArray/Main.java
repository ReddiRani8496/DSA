package DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
//        System.out.println(dynamicArray.size());
//        System.out.println(dynamicArray.isEmpty());
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(50);

        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(3));
        dynamicArray.set(2,100);
        dynamicArray.print();
        System.out.println(dynamicArray.removeLast());
        dynamicArray.print();
    }
}
