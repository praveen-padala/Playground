import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int list[] = new int[size];
    int larger = list[0], index = 0;
    
    for(int i = 0; i<size; i++)
      list[i] = in.nextInt();
    
    for(int i = 1; i < size; i++)
    {
          if(list[i] > larger)
          {
               index = i;
               larger = list[i];
          }
    }
    System.out.println(index);
  }
}