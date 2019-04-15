import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
       Scanner in = new Scanner(System.in);
       int number = in.nextInt();
       
       for(int count = 1; count <= number; count++)
       {
            System.out.print(count);
            if(count % 3 == 0 && count != number)
                 System.out.print(",");
       }
  }
}