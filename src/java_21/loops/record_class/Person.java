package java21.loops.record_class;

public record Person(String name, int age) implements Drinkable {

    public Person() {
        this("", 0);
    }

    boolean isAdult() {
        return age > 18;
    }

    @Override
    public void canDrink() {
        System.out.println(name + " of age " + age + " si drinking water");
    }
}

class Demo {
    public static void main(String[] args) {
        Person p = new Person("John", 30);
        System.out.println(p.name());
        System.out.println(p.age());
        System.out.println(p);
        System.out.println(p.hashCode());
        System.out.println(p.equals(new Person("John", 30)));
    }
}