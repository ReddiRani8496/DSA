class Main {
   public static void main(String[] args) {
      LinearProbing map = new LinearProbing();
      map.put(1,"rani");
      map.put(2,"rahul");
      map.put(3,"raju");
      map.put(10,"rakesh");
      System.out.println(map);
  //    map.remove(10);
      System.out.println(map);
      map.remove(2);
      System.out.println(map);
//      map.remove(8);
    //  System.out.println(map.containsKey(10));
    System.out.println(map.containsValue("rani"));
      System.out.println(map.get(10));
   }
}