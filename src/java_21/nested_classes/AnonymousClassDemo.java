package java21.nested_classes;

interface Animal {
    void show(String name);
}

public class AnonymousClassDemo {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void show(String name) {
                System.out.println("name is " + name);
            }
        };
        animal.show("Spike");
    }
}
