import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            System.out.print("Deposit amount (Rs.): ");
            double p = sc.nextDouble();
             System.out.print("Annual interest rate (8-12%): ");
            double R = sc.nextDouble();
            System.out.print("Duration in years (1-5): ");
            int T = sc.nextInt();

            if (p < 1000) {
                System.out.println("Amount too low. Minimum is Rs. 1000.");

            } else if (R < 8 || R > 12) {
                System.out.println("Rate should be between 8 and 12.");

            } else if (T < 1 || T > 5) {
                System.out.println("Duration should be 1 to 5 years.");

            } else {

                double Rate= R / 100 / 12;
                int n = T * 12;

                double A = p * Math.pow(1 + Rate, n);
                double fee = A * 0.005;
                double received = A - fee;

                System.out.println("\nFD Result:");
                System.out.printf("Principal      : Rs. %.2f%n", p);
                System.out.printf("Rate           : %.1f%%%n", R);
                System.out.printf("Duration       : %d yrs / %d months%n", T, n);
                System.out.printf("Maturity       : Rs. %.2f%n", A);
                System.out.printf("Fee (0.5%%)     : Rs. %.2f%n", fee);
                System.out.printf("You get        : Rs. %.2f%n", received);
                System.out.println();
            }

            System.out.print("Another calculation? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("Done. Goodbye!");
        sc.close();
    }
}