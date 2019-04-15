import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in  = new Scanner(System.in);
      int size = in.nextInt();
      int array[] = new int[size];
      
      for(int i = 0; i < size; i++)
        array[i] = in.nextInt();
      int new_array[] = new int[size];
      int zero_count = 0, counter = 0;
      
      for(int i = 0; i < size; i++)
      {
           if(array[i] == 0)
             zero_count++;
           else
           {
                new_array[counter] = array[i];
                counter++;
           }
      }
      
      for(int i = counter; i < (counter + zero_count); i++)
      {
          new_array[i] = 0;
      }
      for(int i = 0; i < size; i++)
        System.out.print(new_array[i]+" ");
      
    }
}