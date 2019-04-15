import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in  = new Scanner(System.in);
      int size = in.nextInt();
      int array[] = new int[size];

      int temp;
      
      for(int i = 0; i < size; i++)
           array[i] = in.nextInt();
      int k = in.nextInt();
      for(int i = 0; i < size; i++)
      {
           for(int j = i+1; j < size; j++)
           {
                if(array[i] < array[j])
                {
                     temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                }
           }
      }
       
       System.out.print(array[k -1]);
    }   
}