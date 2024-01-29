package branching_looping_statements;

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
//        if (input1 > input2){
//            System.out.println(input2);
//        } else if (input2 > input3) {
//            System.out.println(input3);
//        }else
//            System.out.println(input1);


//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        System.out.print("Enter the third number: ");
//        double num3 = scanner.nextDouble();
//
//        // Close the Scanner to avoid resource leak
//        scanner.close();
//
//        // Find the smallest number using if-else conditions
//        double smallestNumber = num1;
//
//        if (num2 < smallestNumber) {
//            smallestNumber = num2;
//        }
//
//        if (num3 < smallestNumber) {
//            smallestNumber = num3;
//        }
//
//        // Display the smallest number
//        System.out.println("The smallest number is: " + smallestNumber);

        //Using Ternary Operator

        int smallestNumber = (input1 < input2) ? ((input1 < input3) ? input1 : input3) : ((input2 < input3) ? input2 : input3);
        System.out.println(smallestNumber);
    }
}
