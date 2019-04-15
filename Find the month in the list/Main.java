import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
         InputStreamReader obj = new InputStreamReader(System.in);
         BufferedReader obj1 = new BufferedReader(obj);
         String str = obj1.readLine();
         String month = obj1.readLine();
         String input[] = str.split(",");
         List<String> list = new LinkedList<String>();
         for(int i = 0; i < input.length; i++)
         {
              list.add(input[i]);
         }
         System.out.println(list);
         System.out.println("Size of the linked list: "+list.size());
         System.out.println("Is LinkedList empty? "+list.isEmpty());
         System.out.println("Does LinkedList contains "+month+"?");
         System.out.println(list.contains(month));
         
    }
}