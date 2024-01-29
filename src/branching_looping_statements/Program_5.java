package branching_looping_statements;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double purchaseAmount = scanner.nextDouble();
        if (purchaseAmount <500){
            System.out.println("No discount is applied");
        } else if (purchaseAmount >= 500 && purchaseAmount <=1000) {
            double discount = 0.1 * purchaseAmount;
            double discountedAmount = purchaseAmount - discount;

            // Display the discounted amount
            System.out.println("Purchase amount: $" + purchaseAmount);
            System.out.println("Discount applied (10%): $" + discount);
            System.out.println("Discounted amount: $" + discountedAmount);
        } else {
            // No discount applied
            System.out.println("Purchase amount: $" + purchaseAmount);
        }
        if (purchaseAmount>1000){
            double discount = 0.2 * purchaseAmount;
            double discountedAmount = purchaseAmount - discount;

//            System.out.println("Purchased amount is " + purchaseAmount);
            System.out.println("Discounted Amount " + discount);
            System.out.println("Discounted Amount $" + discountedAmount);
        }



    }
}
