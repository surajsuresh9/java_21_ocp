package java21.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Character> charsList = new ArrayList<>();
        charsList.add('b');
        charsList.add('Z');
        charsList.add('A');
        charsList.add('Z');
        charsList.add('d');
        charsList.add('F');
        Collections.sort(charsList);
        System.out.println(charsList);
        Collections.sort(charsList, new MyChars());
        System.out.println(charsList);

    }
}

class MyChars implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        if (o1 < o2) {
            return 1;
        } else if (o2 < o1) {
            return -1;
        } else {
            return 0;
        }
    }
}