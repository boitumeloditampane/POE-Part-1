package test;

import org.junit.Test;
import Productsales.Product;
import static org.junit.Assert.*;

    public class ProductTest {
        String[] names = {"A", "B", "C"};
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};

        public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
            Product p = new Product(names, sales);
            assertEquals(153, p.GetTotalProductsSold());
        }

        public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
            Product p = new Product(names, sales);
            assertEquals(17.0, p.GetAverageProductSold(), 0.01);
        }
    }
