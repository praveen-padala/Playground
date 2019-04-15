import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
        int noOfParts = in.nextInt();
        String temp = str;
        String result = str.replace(temp, str1);
        String res[] = result.split(" ", noOfParts);
        for(int index = 0; index < res.length; index++)
             System.out.println(res[index]);
       
    }
}