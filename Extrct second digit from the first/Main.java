import java.util.Scanner;
class Main
{
     public static void main(String args[])
     {
          Scanner in = new Scanner(System.in);
          int number = in.nextInt();
          int count = 0;
          int temp = number;
          
          while(number > 0)
          {
               number = number / 10;
               count = count + 1;
          }
          number = temp;
         
           while(count != 2)
               {
                   number = number / 10;
                   count--;
           }
          System.out.println(number%10);
     }
}
            
            