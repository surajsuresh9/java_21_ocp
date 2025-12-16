package java_21.performance_and_scalability;

public final class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + ": " + p1.getName() + " is " + p1.getAge() + " years old");
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
