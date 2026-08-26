public class PrintSales extends Sales {
    public PrintSales(SalesModel model) {
        super(model);
    }
    public void Print() {
        System.out.println("***************************************************************************************");
        System.out.println("Shoe Sales PRINTOUT");
        System.out.println("***************************************************************************************");
        System.out.println("SHOE Brand: "+ getShoeBrand());
        System.out.println("SHOE Brand Sales: "+ getBrandSales());
        System.out.println("***************************************************************************************");
    }
}
