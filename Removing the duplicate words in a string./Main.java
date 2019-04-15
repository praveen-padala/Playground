import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String arr[] = str.split(" ");
    int length = arr.length;
    int array[] = new int[length];
    
    for(int i = 0; i < length; i++)
    {
         for(int j = i+ 1; j < length;j++)
         {
             if(arr[i].equals(arr[j]) == true)
             {
                  array[j] = 1;
             }
         }
    }
    StringBuilder str1 = new StringBuilder("");
    for(int index = 0; index < length; index++)
    {
       if(array[index] == 1)
           continue;
      else
      {
         str1.append(arr[index]);
           str1.append(" ");
      }
    }
    System.out.print(str1);
                 
                  
  }
}