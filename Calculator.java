 import java.util.*;
 public class calculator {
     public static void main(String[] args) {

         int number1, number2, result;
         char ch;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number.");
         number1 = sc.nextInt();
         System.out.println("Enter operator Such as : + , - , * , / , % .");
         ch = sc.next().charAt(0);
         System.out.println("Enter Second number.");
         number2 = sc.nextInt();
         System.out.println("============  Your Answer Is  =============");

         switch (ch) {
             case '+':
                 result = number1 + number2;
                 System.out.println();
                 System.out.println("                       " + result);
                 break;

             case '-':
                 System.out.println();
                 result = number1 - number2;
                 System.out.println("                        " + result);
                 break;

             case '*':
                 System.out.println();
                 result = number1 * number2;
                 System.out.println("                         " + result);
                 break;

             case '/':
                 System.out.println();
                 result = number1 / number2;
                 System.out.println("                          " + result);
                 break;

             case '%':
                 System.out.println();
                 result = number1 % number2;
                 System.out.println("                          " + result);
                 break;

             default:
                 System.out.println("       You enter invalid operator    ");

         }
     }

 }
      



     
 
