package java21.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExamples {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int i = 1;
        while (i <= 50) {
            l.add(i);
            i++;
        }
        System.out.println("List: " + l);
//        Iterator<Integer> iterator = l.iterator();
//        while (iterator.hasNext()) {
//            Integer el = iterator.next();
//            if (el % 3 != 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println("List: " + l);

        ListIterator<Integer> listIterator = l.listIterator();
        System.out.print("Index: ");
        while (listIterator.hasNext()) {
            int idx = listIterator.nextIndex();
            System.out.print(idx + ", ");
            int el = listIterator.next();
            if (el % 3 != 0) {
                listIterator.set(-1);
            }
        }
        System.out.println();
        System.out.println("List: " + l);
    }
}
