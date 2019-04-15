import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int column_length = in.nextInt();
        int length = str.length();
        StringBuilder new_str = new StringBuilder("");
        
        for(int index = 0; index < length; index++)
            if(str.charAt(index) != ' ')
               new_str.append(str.charAt(index));
  
        int new_str_length = new_str.length();
        int cur_idx;
        int row_count = new_str_length / column_length;
        if(new_str_length % column_length > 0)
           row_count++;
         
        for(int col = 0; col < column_length; col++)
        {
             for(int row = 0; row < row_count; row++)
             {
                   if(row % 2 == 0)
                      {
                          cur_idx = col + (row * column_length);
                      }
                    else
                      {
                         cur_idx = (row * column_length) + (column_length - 1);  
                         cur_idx = cur_idx - col;
                      }
                      
                       
                      if(cur_idx >= new_str_length)
                          System.out.print("X");
                      else
                          System.out.print(new_str.charAt(cur_idx));
                      
                     
              }
        }
   }
 }
                 