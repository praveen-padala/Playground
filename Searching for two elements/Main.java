import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int ar[] = new int[size];
     
      int first_index = -1, second_index = -1;
      
      for(int i = 0; i < size; i++)
        ar[i] = in.nextInt();
       int first = in.nextInt();
      int second = in.nextInt();
      for(int i = 0; i < size; i++)
      {
           if(ar[i] == first)
                first_index = i;
            if(ar[i] == second)
                 second_index = i;
      }
      System.out.println(first_index);
      System.out.println(second_index);
      
    }
}