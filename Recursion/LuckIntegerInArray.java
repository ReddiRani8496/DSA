package Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuckIntegerInArray {
    public static void main(String[] args) {

    int[] arr = {1,2,2,3,3,3};
    findLucky(arr);

    }
    public static void findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int num = -1;
        for(Map.Entry<Integer,Integer> val:map.entrySet()) {
            if(val.getKey().equals(val.getValue())) {
                num = Math.max(num, val.getKey());
            }
        }
        System.out.println(num);
    }


}


