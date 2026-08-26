void main() {
    String[] brand = {"NIKE", "ADIDAS", "REEBOK"};
    String[] Q = {"Q1", "Q2", "Q3", "Q4"};
    int[][] sales = {{100, 150, 70}, {88, 92, 103}, {75, 45, 90}, {65, 95, 175}};

    System.out.println("ULTIMATE SHOE SALES");
    System.out.println("------------------------------------------------------------------------------------");

    System.out.printf("%-18s", "QUARTER");
    for (int label = 0; label < brand.length; label++) {
        System.out.printf("%-8s", brand[label]);
    }

    System.out.println();
    System.out.println("-------------------------------------------------------------------------------");
    for (int column = 0; column < Q.length; column++) {
        System.out.printf("%-18s", Q[column]);
        for (int numbers = 0; numbers < sales[column].length; numbers++) {
            System.out.printf("%-8d", sales[column][numbers]);}
        System.out.println();



    }
    System.out.println("----------------------------------------------------------------------------");
    System.out.printf("%-18s", "TOTAL:");
    for(int brandIndex= 0 ; brandIndex<brand.length; brandIndex++){
        int Total=0;
        for(int row=0 ; row< sales.length; row++){
            Total +=sales [row][brandIndex];

        }
        System.out.printf("%-8d", Total);
    }
    System.out.println();
    System.out.printf("%-18s" , "AVARAGE");
    for (int brandIndex=0; brandIndex< brand.length; brandIndex++){

        int Total= 0;
        int maximum= sales [0][brandIndex];
        int minimum= sales [0][brandIndex];

        for (int row = 0; row< sales.length; row++){
            Total+= sales [row][brandIndex];

            if (sales [row][brandIndex]> maximum){
                maximum = sales [row][brandIndex];
            }
            if (sales [row][brandIndex]< minimum){
                minimum= sales[row][brandIndex];
            }
        }
        double avarage = (double) Total / sales.length;
        System.out.printf("%-8.1f", avarage);
    }
    System.out.println();

    System.out.printf("%-18s" , "MIN:");
    for (int brandIndex= 0 ; brandIndex<brand.length; brandIndex++){
        int minimum= sales [0][brandIndex];
        for (int row = 1; row<sales.length; row++){
            if (sales[row][brandIndex]<minimum){
                minimum= sales[row][brandIndex];
            }
        }
        System.out.printf("%-8d", minimum);
    }
    System.out.println();

    System.out.printf("%-18s", "MAX:");
    for (int brandIndex= 0; brandIndex< brand.length; brandIndex++){

        int maximum= sales[0][brandIndex];

        for (int row=1; row< sales.length; row++){
            if (sales[row][brandIndex]> maximum){
                maximum= sales[row][brandIndex];
            }
        }
        System.out.printf("%-8d", maximum);
    }
    System.out.println();
    System.out.println("------------------------------------------------------------------------------------");
}