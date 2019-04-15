import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
		int number = in.nextInt();
        int result = sum(number);
        System.out.print(result);
        
    }
    public static int sum(int number)
    {
         if(number == 0)
              return 0;
         else
             return number   + sum(number - 1);
    }
}