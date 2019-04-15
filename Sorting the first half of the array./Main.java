import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int list[] = new int[size];
    
       for(int index = 0; index < size; index++)
            list[index] = in.nextInt();
       int half_size = (size) / 2; // to sort only half of the list
       int temp; // acts as temporary variable for swapping
         
       for(int round = 0; round < half_size; round++)// it takes the element from index 0 to the half_size - 1
       {
            for(int index = 0; index < (half_size - round)-1; index++)
            {
                  if(list[index] > list[index + 1])
                  {
                       temp = list[index];
                       list[index] = list[index + 1];
                       list[index + 1] = temp;
                  }
            }
       }
    for(int index = 0; index < size; index++)
          System.out.print(list[index] + " ");
                 
  }
}