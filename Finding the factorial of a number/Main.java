import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
       Scanner in = new Scanner(System.in);
       int number = in.nextInt();
       int result = fact(number);
       System.out.print(result);
  }
  public static int fact(int number)
  {
       if(number == 0)
            return 1;
       else
           return number * fact(number - 1);
  }
}