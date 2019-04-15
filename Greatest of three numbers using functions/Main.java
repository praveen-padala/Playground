import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
     int larger = great_of_two(n1,n2);
      if(n3 > larger)
        System.out.print(n3);
      else 
        System.out.print(larger);
	}
  public static int great_of_two(int n1, int n2)
  {
    if ( n1 > n2)
      
      return n1;
    else 
      return n2;
  }
}