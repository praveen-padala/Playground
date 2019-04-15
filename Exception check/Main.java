import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
       Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       try
       {
          
           int number = Integer.parseInt(str);
           System.out.println(number);
       }
     catch(Exception e)
     { 
         System.out.println("Input Mismatch Exception occurred");
     }
     
         
             
   }
}