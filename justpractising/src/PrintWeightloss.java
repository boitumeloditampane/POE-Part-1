public class PrintWeightloss  extends Weightloss {
    public PrintWeightloss(WeightlossModel model){
        super(model);
    }
    public void Print() {
        System.out.println("********************************************************************************");
        System.out.println("Customer weight loss printout");
        System.out.println("********************************************************************************");
        System.out.println("Customer name: " + getCustomerName());
        System.out.println("Weight loss Amount: " + getWeightlossAmount());
        System.out.println("********************************************************************************");
    }
}
