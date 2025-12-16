package java_21.lambda_exp;


@FunctionalInterface
public interface Animal {
    void show(String animal, int speed);
}

class AnimalTest {
    public static void main(String[] args) {
        Animal animal = (a, s) -> {
            System.out.println("Animal " + a + " has a speed of " + s);
        };
        animal.show("Cheetah", 90);
    }

}
