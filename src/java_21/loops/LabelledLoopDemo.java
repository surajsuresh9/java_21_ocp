package java21.loops;

public class LabelledLoopDemo {
    public static void main(String[] args) {
        System.out.println("Unlabelled Loops");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("Outer Loop: " + i + ", Inner Loop: " + j);
                if (i == 2 && j == 2) {
                    break;
                }
            }
        }
        System.out.println("\nLabelled Loops");
        Outer:
        for (int i = 0; i <= 3; i++) {
            Inner:
            for (int j = 0; j <= 3; j++) {
                System.out.println("Outer Loop: " + i + ", Inner Loop: " + j);
                if (i == 2 && j == 2) {
                    break Outer;
                }
            }
        }
    }
}
