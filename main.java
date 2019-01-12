public class FiveSix {
        public static void main(String[] args) {
        int milesone = 1;
        int kilone = 20;
        
        System.out.print("Miles\tKilometers\t|\tKilometers\tMiles");
        
        
        while(milesone <= 10){
        if(milesone<=10 && kilone <=65){
        double formula1 = milesone / 0.62137;
        System.out.printf("\n" + milesone + "\t%.3f", formula1);
         milesone++;
        
        double formula2 = kilone * 0.62137;
        System.out.printf("\t\t|\t" + kilone + "\t\t%.3f", formula2);
        kilone = kilone +5;
    }
        }
          System.out.print("\n");
    }
}
