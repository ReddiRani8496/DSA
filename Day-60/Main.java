public class Main {
    public static void main(String[] args) {
       HashTable hashTable = new HashTable();
       hashTable.put(10,"mock");
       hashTable.put(6,"rock");
       hashTable.put(8,"knock");
       hashTable.put(20,"duck");
        System.out.println(hashTable.get(8));
        hashTable.remove(8);
        System.out.println(hashTable.get(8));
    }
}

