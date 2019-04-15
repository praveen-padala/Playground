import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int range = in.nextInt();
      int arr[] = new int[size];
      
      for(int i = 0; i < size; i++)
           arr[i] = in.nextInt();
      int frequency;
      for(int number = 1; number <= range; number++)
      {
           frequency = 0;
           for(int index = 0; index < size; index++)
           {
                if(number == arr[index])
                     frequency++;
           }
           System.out.println(number + " "+ frequency);
      }
           
    }
}