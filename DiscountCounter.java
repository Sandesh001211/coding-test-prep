import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Input: Single integer - the purchase amount
        if (scanner.hasNextInt()) {
            int amount = scanner.nextInt();
            double discountRate = 0.0;

            // 2. Apply logic based on Discount Slabs
            if (amount < 1000) {
                discountRate = 0.05; // 5% discount
            } else if (amount >= 1000 && amount < 5000) {
                discountRate = 0.10; // 10% discount
            } else {
                discountRate = 0.15; // 15% discount (amount >= 5000)
            }

            // 3. Final Amount Calculation
            // Formula: Final Amount = Amount - (Amount * Discount Rate)
            double finalAmount = amount - (amount * discountRate);

            // 4. Output: Final amount printed to 2 decimal places
            System.out.printf("%.2f%n", finalAmount);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        scanner.close();
    }
}
