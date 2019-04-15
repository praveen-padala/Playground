import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int length = str.length();
    int index = 0;
    double sum = 0, sum1 = 0;
    boolean is_decimal = true;
    int count = 0;
    
    while(index < length)
    {
         if(str.charAt(index) == '.')
         {
             is_decimal = true;
             index++;
              break;
         }
        else
          sum = sum * 10 + (str.charAt(index) - 48);
          index++;
    }
    while(index < length)
    {
         sum1 = sum1 * 10 + (str.charAt(index) - 48);
         count++;
         index++;
    }
    if(is_decimal == true)
    {
         for(int i = 0; i < count; i++)
             sum1 = sum1 * 0.1;
      sum = sum + sum1;
    }
      
    
    
    System.out.printf("%.6f",sum);
  }
}