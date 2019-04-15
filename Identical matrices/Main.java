import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       boolean is_identical = true;
       int no_of_rows = in.nextInt();
       int no_of_cols = in.nextInt();
       int matrix[][] = new int[no_of_rows][no_of_cols];
       
      int matrix1[][] = new int[no_of_rows][no_of_cols];
    
       for(int row = 0; row < no_of_rows; row++)
       {
           for(int col = 0; col < no_of_cols; col++)
           {
                matrix[row][col] = in.nextInt();
           }
       }
        for(int row = 0; row < no_of_rows;row++)
       {
           for(int col = 0; col < no_of_cols ; col++)
           {
                matrix1[row][col] = in.nextInt();
           }
       }
     
           for(int row = 0; row < no_of_rows; row++)
           {
                for(int col = 0; col < no_of_cols; col++)
                {
                     if(matrix[row][col] != matrix1[row][col])
                     {
                          is_identical = false;
                          break;
                     }
                  
                }
           }
      
       
        if(is_identical == true)
             System.out.print("Yes");
        else
          System.out.print("No");
        
      
  }
}