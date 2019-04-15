import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int list[] = new int[size];
    int sum_list[] = new int[size / 3];
    int count = 0, index = 0, sum = 0;
    
    for(int i = 0; i < size; i++)
         list[i] = in.nextInt();
    for(int i = 0; i < size; i++)
    {
          sum = sum + list[i];
          count++;
          if( count % 3 == 0)
          {
              sum_list[index] = sum;
              sum = 0;
              index++;
          }
    }
  int checker = sum_list[0];
    boolean flag = true;
    for(int i = 1; i <index; i++)
    {
        if(checker != sum_list[i])
         {
             flag = false;
             break;
         }
     
    }
     if(flag == true)
       System.out.println("Perfect Batch");
    else
        System.out.println("Not a Perfect Batch");
      
               
    
  }
}