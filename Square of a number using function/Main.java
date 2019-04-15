import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      square(number);
      
	} 
    public static void square(int number)
    {
      System.out.println(number * number);
    }
}