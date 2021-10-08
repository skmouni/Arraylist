package Hashmap;


import java.util.HashMap;
import java.util.Map;

public class HashMapExe {

    private static Object m;

    public static void main(String args[]) {
        //  HashMap hm=new HashMap();//
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // adding pair into ashmap
        hm.put(20, "mouni");
        hm.put(30, "ash");
        hm.put(40, "santh");
        hm.put(50, "rqj");
        System.out.println(hm);
        // removinh the pair//
        hm.remove(40);
        System.out.println("After removing the pair" + hm);
        // reading pair  using forloop//
        for (Map.Entry m : hm.entrySet()) ;
        {
          //  System.out.println(m.getkey()+" "+m.getvalue());//
        }
    }
}

