package java21.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private String name;
    private int year;
    private int price;

    public Cars(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" + "name='" + name + '\'' + ", year=" + year + ", price=" + price + '}';
    }

    public static void main(String[] args) {
        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars("Mercedes", 2020, 10000));
        carsList.add(new Cars("BMW", 2018, 12000));
        carsList.add(new Cars("Ferrari", 2020, 20000));
        carsList.add(new Cars("Ford", 2024, 15000));
        carsList.add(new Cars("Opel", 2020, 18000));

        Comparator<Cars> priceComparator = Comparator.comparing(Cars::getPrice);
        Comparator<Cars> yearComparator = Comparator.comparing(Cars::getYear);
        Collections.sort(carsList, priceComparator);
        System.out.println(carsList);
        Collections.sort(carsList, yearComparator);
        System.out.println(carsList);

    }
}