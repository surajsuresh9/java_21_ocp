package java_21.exception_handling;

public class ExceptionDemo {
    static void divide() throws NumberFormatException, ArithmeticException {
        float a = Integer.parseInt("12");
//        float b = Integer.parseInt("2");
        float b = Integer.parseInt("0");
        if (b == 0) {
            throw new ArithmeticException("/ by 0");
        }
        float c = a / b;
        System.out.println("Res: " + c);
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (NumberFormatException e) {
            System.out.println("Error while parsing number, enter a valid number");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}
