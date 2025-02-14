package LoopExercise;

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("  ");
            System.out.print(i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print("    ");
            System.out.print(i);
        }
    }

}
