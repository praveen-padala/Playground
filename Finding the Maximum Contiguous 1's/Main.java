import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int array[] = new int[size];
      for(int index = 0; index < size; index++)
           array[index] = in.nextInt();
      int cur_count = 0, max_count = 0;
      for(int index1 = 0; index1 < size; index1++)
        
      {  
            cur_count = 0;
             if(array[index1] == 0)
                      continue;
             else
                  cur_count++;
           for(int index2 = index1 + 1; index2 < size; index2++)
           {
                if(array[index1] == array[index2])
                {
                     cur_count++;
                     index1 = index1 + 1;
                }
                else
                  break;
           }
            if(cur_count > max_count)
                      max_count = cur_count;
      }
      System.out.print(max_count);
                      
                      
                
      
      
    }
}