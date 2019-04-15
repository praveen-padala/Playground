import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int large = 0;
      for(int i = 0; i < size; i++)
           arr[i] = in.nextInt();
      for(int i = 0; i < size; i++)
      {
           if(large < arr[i])
             large = arr[i];
      }
      System.out.println(large);
    }
}