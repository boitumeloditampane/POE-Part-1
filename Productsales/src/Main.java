import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] products = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
        };
        int[][] sales = new int[3][3];

        for (int p = 0; p < products.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + products[p] + ": ");
                sales[p][m] = input.nextInt();
            }
        }

        int total = 0;
        int bestTotal = -1;
        int bestIndex = 0;

        for (int p = 0; p < sales.length; p++) {
            int productTotal = 0;
            for (int m = 0; m < sales[p].length; m++) {
                productTotal += sales[p][m];
            }
            total += productTotal;
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = p;
            }
        }

        double average = (double) total / (sales.length * sales[0].length);

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**********************************");
        System.out.println("TOTAL PRODUCT SALES: " + total);
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", average);
        System.out.println("MOST POPULAR PRODUCT: " + products[bestIndex] + " (" + bestTotal + ")");
    }
}