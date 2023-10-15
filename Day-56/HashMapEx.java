import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(5,"Rahul");
        map.put(3,"King");
        map.put(8,"John");
        map.put(6,"smith");
        System.out.println(map);
        
        map.remove(8);
        System.out.println(map);

        for(var x: map.entrySet())
            System.out.println(x.getKey());

        for(var x: map.entrySet())
            System.out.println(x.getValue());

        for(var x: map.entrySet())
            System.out.println(x.getKey()+":"+x.getValue());

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("John"));
    }
}
