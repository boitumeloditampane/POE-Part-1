//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String [] months= {"Month 1", "Month 2", "Month 3"};
    String [] gym = {"GYM1", "GYM2","GYM3"};
    int [][] kilograms= {{10,20,27}, {22,5,20}, {30,20,10}
    };

    System.out.println("GYM WEIGHTLOSS APPLICATION");
    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.printf("%-18s", "");
    for
    (int month= 0; month<months.length; month++){
        System.out.printf("%-8s", months[month]);

    }
    System.out.printf("| %-8s%-10s%-8s%-8s", "TOTAL", "AVG", "MIN", "MAX");
    System.out.println();
    System.out.println("----------------------------------------------------------------------------------------------");

    for (int g=0; g< gym.length;g++){
        System.out.printf("%-18s" , gym[g]);
        for (int k =0 ; k<kilograms[g].length; k++ )
        {
            System.out.printf("%-8s", kilograms[g][k]+ "kg" );
        }

        int total = 0;
        int minimum= kilograms[g][0];
        int maximum = kilograms [g][0];

        for (int k = 0 ; k<kilograms[g].length; k++){
            total += kilograms[g][k];

            if  (kilograms[g][k]< minimum){
                minimum = kilograms[g][k];
            }
            if (kilograms[g][k]> maximum){
                maximum = kilograms[g][k];
            }
        }
        double avarage = (double) total / kilograms[g].length;

        System.out.printf("| %-8s", total + "kg");
        System.out.printf("%-12s",String.format("%.2fkg",avarage));
        System.out.printf("%-8s", minimum + "kg");
        System.out.printf("%-8s", maximum+ "kg");

        System.out.println();
    }
}
