package branching_looping_statements;

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        for (int i = numberOfRows; i >= 1; i--) {
            for (int j = numberOfRows; j > i; j--) {
                System.out.print(" "+j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
