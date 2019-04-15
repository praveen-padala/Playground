import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      
      for(int count = 1; count <= number; count++)
      {
           if(number % count == 0)
             System.out.println(count);
      }
	}
}