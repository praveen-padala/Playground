import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      sum_of_numbers(number);
      
	}
  public static void sum_of_numbers(int number)
  {
    int sum = 0;
    for(int i = 1; i<= number;i++)
      sum = sum + i;
     System.out.println(sum);
  }
    
}