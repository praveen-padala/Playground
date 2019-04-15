import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int array[] = new int[size];
    for(int index = 0; index < size; index++)
         array[index] = in.nextInt();
    boolean is_not_set = true;
    int start_index = 0, end_index = 0, sum = 0, max_sum = 0;
    for(int index = 0; index < size; index++)
    {
         if(is_not_set == true)
         {
              start_index = index;
              end_index = index;
              is_not_set = false;
         }
     
         
             if(((index+1) < size) &&(array[index] < array[index + 1]))
               {
                   end_index = index + 1;
               
               }
              else
              {
                   sum  = 0;
                   is_not_set = true;
                for(int index2 = start_index; index2 <= end_index; index2++)
                {
                     sum = sum + array[index2];
                }
                if(sum > max_sum)
                     max_sum = sum;
              }
                    
         
    }
      System.out.print(max_sum);
           
 
  }
}