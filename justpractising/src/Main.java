//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
WeightlossModel model = new WeightlossModel();
model.CustomerName = "Jared";
model.weightlossAmount = 43;

PrintWeightloss printWeightLoss = new PrintWeightloss(model);
printWeightLoss.Print();
}

