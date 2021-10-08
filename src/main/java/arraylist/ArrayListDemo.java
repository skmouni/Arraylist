package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mouni");
        list.add("mani");
        list.add("santhu");
        list.add("rajani");
        System.out.println(list.size());
        System.out.println("Before removing elements" + list);
        // removing the elements//
        list.remove(1);
        System.out.println(list.size());
        System.out.println("After removing elements" + list);
        // inserting a new element//
        list.add(2, " ash");
        System.out.println(list.size());
        System.out.println("after inserting element" + list);
        //  read the valus from arry list//
        for (String s : list) ;
        {
            System.out.println("s");
        }
    }
}
