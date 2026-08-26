
void main() {
    SalesModel model = new SalesModel();
    model.ShoeBrand= "NIKE";
    model.BrandScales= 100;

    PrintSales printSales= new PrintSales(model);
    printSales.Print();

}