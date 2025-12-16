package java21.collections.list;

import java.util.*;

public class ListArray {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // convert list to array

        // for loop
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        System.out.println(Arrays.toString(arr));

        nums.add(5);
        // toArray()
        Object[] a = nums.toArray();
        System.out.println(Arrays.toString(a));

        // arr to list
        String[] cars = {"Audi", "BMW", "Mercedes", "Opel"};
//        List<String> carsList = Arrays.asList(cars);
        ArrayList<String> carsList = new ArrayList<>(Arrays.asList(cars));
        System.out.println(carsList);


        cars = new String[]{"Audi", "BMW", "Mercedes", "Opel", "Ford"};
        carsList.clear();
        Collections.addAll(carsList, cars);
        System.out.println(carsList);
    }
}
