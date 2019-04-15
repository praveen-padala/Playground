import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int min;
      int result = gcd(n1, n2);
      if(result > n3)
        min = n3;
      else 
        min = result;
          while(result % min != 0 && result % min != 0)
          {
             min--;
          }
      System.out.print(min);
    
  
        
	}
  public static int gcd(int result, int n3)
  {
    int min;
      if ( result > n3)
        min = n3;
       else 
         min = result;
    while (result % min != 0 && n3 % min != 0)
    {
      min--;
    }
    return min;
  }
}