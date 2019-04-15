import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
        int number = in.nextInt();
        int num = 1;
      
      for(int cur_row = 1; cur_row <= number; cur_row++)
      {
        for(int cur_col = 1;cur_col <= cur_row; cur_col++)
          
        {
          if(num % 2 == 0)
             System.out.print("#");
          else
            System.out.print("*");
          num++;
            
        }
        System.out.println();
      }
               
    }
}