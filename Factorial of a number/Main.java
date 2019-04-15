import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code herere
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int result = 1;
      for(int count = 1; count <= number; count++)
      {
           result = result * count;
      }
      System.out.println(result);
	}
}