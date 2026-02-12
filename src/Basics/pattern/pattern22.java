package Basics.pattern;

public class pattern22 {
    public void printPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == 0 || j == 0 || i == 2 * n - 2 || j == 2 * n - 2) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern22 printer = new pattern22();
        printer.printPattern(5); // main just delegates
    }
}