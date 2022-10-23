import java.util.*;
public class FoodOrder {
    public static void main(String[] args) {

      FoodOrder fo = new FoodOrder();
      fo.displayMenu();
      fo.order();


    }






       int Pizza = 200, Coffee = 150, Tea = 120, Frenchfishries = 250, Icecream = 350;
       int total ;
         String again;
Scanner sc = new Scanner(System.in);
public void displayMenu() {
         System.out.println("*************************   Well Come To Our Cafe  ***************************");
         System.out.println(" ============================================================================ ");
         System.out.println();
         System.out.println("               1.  Pizza            =      200.              ");
         System.out.println("               2.  Coffee           =      150.               ");  
         System.out.println("               3.  Tea              =      120.                               ");  
         System.out.println("               4.  Frenchfishries   =      250.                       ");  
         System.out.println("               5.  Icecream         =      350.                ");  
         System.out.println("               6.  Exit                               ");  
         System.out.println("==================================================================================");
           System.out.println("          What Do You Want to Order Today ??");
}

public void generateBill()
{
    System.out.println();
    System.out.println("***************** Thank You For Ordering **************");
    System.out.println("*****************   Your Bill is " + total+ ".\t***********");

}

   

           public void order() {
                System.out.println(" Enter Your Choice.");
             int    choice = sc.nextInt();
                switch (choice) {
            case 1:
            System.out.println("You Have Selected Pizza. ");
            System.out.println();
            System.out.println("Enter the desired Quantity.");
            int quantity=sc.nextInt();
            
            total = total+ quantity * Pizza;
            break;

            case 2:
            System.out.println("You Have Selected Coffee. ");
            System.out.println();
            System.out.println("Enter the desired Quantity.");
            quantity=sc.nextInt();
            total =total+ quantity*Coffee;
            break;


            case 3:
            System.out.println("You Have Selected Tea. ");
            System.out.println();
            System.out.println("Enter the desired Quantity.");
            quantity=sc.nextInt();
            total =total+ quantity*Tea;

            break; case 4:
            System.out.println("You Have Selected Frenchfishries. ");
            System.out.println();
            System.out.println("Enter the desired Quantity.");
            quantity=sc.nextInt();
            total =total+ quantity*Frenchfishries;
            break;


            case 5:
            System.out.println("You Have Selected Icecream. ");
            System.out.println();
            System.out.println("Enter the desired Quantity.");
            quantity=sc.nextInt();
            total = total+ quantity * Icecream;
            break;
           case 6:
           System.exit(1);
           break;
       default:
           break;
        }

           System.out.println();
           System.out.println("Do You Want to Order anything else (Y/N): Press Y or N ");
           again = sc.next();
           if (again.equalsIgnoreCase("Y")){
               order();
           } 
           else if (again.equalsIgnoreCase("N")) {
               generateBill();
               System.exit(1);
           }
           else {
           System.out.println("Invalid Choice.");
           }


        }


   }







  

