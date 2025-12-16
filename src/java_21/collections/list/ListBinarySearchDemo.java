package java21.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListBinarySearchDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(11);
        list.add(17);
        list.add(15);
        list.add(39);
        list.add(27);
        list.add(22);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 17));
        System.out.println(Collections.binarySearch(list, 27));
        System.out.println(Collections.binarySearch(list, 8));
    }
}
