import java.util.*;
public class Foodorder2 {
    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            int Pizza = 200, Coffee = 150, Tea = 120, Frenchfishries = 250, Icecream = 350, Water = 60;
            int total, quantity, choice;

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("*************************   Well Come To Our Cafe  ***************************");
            System.out.println(" ============================================================================ ");
            System.out.println();
            System.out.println("               1.  Pizza            =      200.              ");
            System.out.println("               2.  Coffee           =      150.               ");
            System.out.println("               3.  Tea              =      120.                               ");
            System.out.println("               4.  Frenchfishries   =      250.                       ");
            System.out.println("               5.  Icecream         =      350.                ");
            System.out.println("               6.  Water            =      60.                  ");
            System.out.println("==================================================================================");
            
            System.out.println("===>  Enter Your Choice.  ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("===>  You Have Selected Pizza. ");
                    System.out.println();
                    System.out.println("===>  Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Pizza;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;

                case 2:
                    System.out.println("===>  You Have Selected Coffee. ");
                    System.out.println();
                    System.out.println("===>Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Coffee;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;

                case 3:
                    System.out.println("===>  You Have Selected Tea. ");
                    System.out.println();
                    System.out.println("===>  Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Tea;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;

                case 4:
                    System.out.println("===>  You Have Selected Frenchfishries. ");
                    System.out.println();
                    System.out.println("===>  Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Frenchfishries;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;

                case 5:
                    System.out.println("===>  You Have Selected Icecream. ");
                    System.out.println("-----------------------------------");
                    System.out.println("===>  Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Icecream;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;

                case 6:
                    System.out.println("===>  You Have Selected Water. ");
                    System.out.println();
                    System.out.println("===>  Enter the desired Quantity.");
                    quantity = sc.nextInt();
                    total = quantity * Water;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("*************   Your Total Bill  ******************** ");
                    System.out.println(total);
                    break;
                default:
                    System.out.println("===>  You Enter Invalid Choice");
                    break;

            }

        }

    }
        
        
        
        
 






 }  

