import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int array[] = new int[size];
      int sum;
      
      for(int index = 0; index < size; index++)
           array[index] = in.nextInt();
      int required_sum = in.nextInt();
      
      for(int index_1 = 0; index_1 < size; index_1++)
      {
           for(int index_2 = index_1 + 1; index_2 < size; index_2++)
           {
               sum = array[index_1] + array[index_2];
                if(sum == required_sum)
                    System.out.println(array[index_1]+", "+array[index_2]);
           }
      }
    }
}