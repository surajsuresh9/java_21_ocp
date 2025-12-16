package java21.nested_classes;

public class InnerClassTest {
    public static void main(String[] args) {
        Users outer = new Users();
        Users.InnerClass innerClass = outer.new InnerClass();
        innerClass.show();
    }
}
