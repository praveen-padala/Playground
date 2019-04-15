import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int list[] = new int[size];
        
       for(int index = 0; index < size; index++)
            list[index] = in.nextInt();
       int first_half = size / 2;
       int temp;
       
      int start_index = 0, end_index = first_half - 1;
      for(int round = start_index; round <end_index; round++)
       {
            for(int index = start_index; index < (end_index - round); index++)
            {
                  if(list[index] > list[index + 1])
                  {
                       temp = list[index];
                       list[index] = list[index + 1];
                       list[index + 1] = temp;
                  }
            }
      }
      start_index = first_half;
      end_index = size;
    int count = 0;
    for(int round = start_index; round < end_index; round++)
       {
            
            for(int index = start_index; index <(end_index - count)-1; index++)
            {
                  if(list[index] < list[index + 1])
                  {
                       temp = list[index];
                       list[index] = list[index + 1];
                       list[index + 1] = temp;
                  }
            }
          count++;
      }
    for(int index = 0; index < size; index++)
            System.out.print(list[index] + " ");
                       
       
  }
  
       
     
}