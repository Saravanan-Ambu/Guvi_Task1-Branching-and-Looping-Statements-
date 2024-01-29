package branching_looping_statements;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input = scanner.nextInt();
        if (input> 0){
            System.out.println("Positive number entered");
        }else if (input <0){
            System.out.println("Negative number entered");
        }
        else
            System.out.println("Zero is entered");
    }
}
