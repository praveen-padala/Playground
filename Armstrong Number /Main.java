import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int count = 0,rem,temp=1,sum= 0,tempo;
      tempo = number;
      while(number > 0)
      {
         number = number / 10;
         count++;
      }
      number = tempo;
      temp = 1;
      while(number > 0)
      {
          temp = 1;
           rem = number % 10;
           for(int i = 1; i <= count; i++)
           { 
                temp = temp*rem;
           }
           sum = sum + temp;
           number = number / 10;
      }
      
             if(sum == tempo)
                  System.out.println("Armstrong Number");
             else
                  System.out.println("Not a Armstrong Number");
             
	}
}