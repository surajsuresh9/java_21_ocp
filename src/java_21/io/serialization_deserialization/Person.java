package java21.io.serialization_deserialization;

import java.io.Serializable;

public class Person implements Serializable {
    private transient long personId;
    private String name, surname;
    private int age;
    private boolean married;
    private double personWeight;
    private transient Weights weights;

    public Person(long personId, String name, String surname, int age, boolean married, double personWeight) {
        this.personId = personId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;

        this.weights = new Weights(personWeight);
        this.personWeight = personWeight;

    }

    @Override
    public String toString() {
        return "personId='" + personId + '\'' + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + '\'' + ", married=" + married + '\'' + ", weight=" + personWeight;
    }
}
