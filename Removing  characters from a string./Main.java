import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
      Scanner in = new Scanner(System.in);
      String main_str = in.nextLine();
      String sub_str = in.nextLine();
      int main_length = main_str.length();
      int sub_length = sub_str.length();
      StringBuilder res_str = new StringBuilder("");
      int array[] = new int[main_length];
    
    for(int index = 0; index < sub_length; index++)
    {
         for(int index1 = 0; index1 < main_length; index1++)
         {
              if(sub_str.charAt(index) == main_str.charAt(index1))
              {
                   array[index1] = 1;
              }
         }
    }
    for(int index = 0; index < main_length; index++)
    {
         if(array[index] == 0)
         {
             res_str.append(main_str.charAt(index));
         }
    }
    System.out.print(res_str);
  }
}