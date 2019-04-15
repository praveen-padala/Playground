import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder("");
    int number = in.nextInt();
    int rem;
    boolean flag = false;
    if(number < 0)
    {
         flag = true;
         number = -(number);
    }
    while(number != 0)
    {
         rem = number % 10;
         str.append((char) (rem + 48));
         number = number / 10;
    }
    if(flag == true)
        str.append('-');
    System.out.print(str.reverse());
    
    
  }
}