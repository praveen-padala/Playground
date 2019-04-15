import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int first = 1, last = number;
      
      for(int row_no = 1; row_no <= number; row_no++)
      {
        for(int col_no = 1; col_no <= number; col_no++)
        {
          if(col_no == first ||col_no == last)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        first++;
        last--;
        System.out.println();
      }
        
      
	}
}