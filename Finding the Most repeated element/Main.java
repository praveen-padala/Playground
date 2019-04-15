import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int array[] = new int[size];
       for(int index = 0; index < size; index++)
            array[index] = in.nextInt();
       int cur_count = 0, max_count = 0, index = 0;
       for(int index1 = 0; index1 < size; index1++)
       {
            for(int index2 = index1 + 1; index2 < size; index2++)
            {
                 if(array[index1] == array[index2])
                 {
                     index1 = index1 + 1;
                      cur_count++;
                 }
            }
            if(max_count < cur_count)
                  index = index1;
       }
    System.out.print(array[index]);
                  
                     
      
    
  }
}