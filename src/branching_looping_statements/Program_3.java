package branching_looping_statements;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reverseNum = 0;
        while (number !=0){
            int digit = number%10;
            reverseNum = reverseNum * 10 +digit;
            number /=10;
        }
        System.out.println(reverseNum);
    }
}
