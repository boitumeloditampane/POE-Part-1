public abstract class Sales implements ISales {
    private String ShoeBrand;
    private int BrandSales;

    public Sales(SalesModel model){
        this.ShoeBrand= model.ShoeBrand;
        this.BrandSales= model.BrandSales;
    }
    public String getShoeBrand(){ return ShoeBrand;}
    public int getBrandSales() {return BrandSales;}

}
