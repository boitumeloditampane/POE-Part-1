
public class Product implements IProduct {
    String[] names;
    int[][] sales;

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    @Override
    public int GetTotalProductSold() {
        return 0;
    }

    public double GetAverageProductSold() {
        return GetTotalProductsSold() / 9.0;
    }

    public String GetMostPopularProduct() {
        int best = 0;
        int bestTotal = 0;
        for (int i = 0; i < 3; i++) {
            int rowTotal = 0;
            for (int j = 0; j < 3; j++) {
                rowTotal = rowTotal + sales[i][j];
            }
            if (rowTotal > bestTotal) {
                bestTotal = rowTotal;
                best = i;
            }
        }
        return names[best] + " (" + bestTotal + ")";
    }
}