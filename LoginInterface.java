import java.util.*;

public class LoginInterface {
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);
            String user, pass;
            System.out.println("Enter Your gmail plz.");
            user = sc.next();
            System.out.println("Enter password plz.");
            pass = sc.next();
           if (user.equalsIgnoreCase("muntazirhussainpanhwar@gmail.com") && (pass.equals("12345678"))) {
        
                System.out.println("=================================================================");
                System.out.println("******************  Well Come on Display Screen *******************");
                if (true) {
                    System.exit(0);
                }
            }

            else {
                System.out.println("You Enter Invalid Gmail Plz Try agin.");
            }
        }

    }

}


        








    

