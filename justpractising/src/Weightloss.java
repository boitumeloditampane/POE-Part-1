public abstract class Weightloss {
    public String CustomerName;
    public double weightlossAmount;

    public Weightloss(WeightlossModel model){
        this.CustomerName=model.CustomerName;
        this.weightlossAmount= model.weightlossAmount;
    }

    public String getCustomerName(){return CustomerName;}
    public double getWeightlossAmount(){return weightlossAmount;}
}
