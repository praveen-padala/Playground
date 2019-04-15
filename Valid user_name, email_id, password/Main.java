import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
      // type your code here
      Scanner sc = new Scanner(System.in);
      String userName = sc.nextLine();
      String email = sc.nextLine();
      String password = sc.nextLine();
      System.out.println("Is "+userName+" a valid user name? "+Pattern.matches("[a-zA-z0-9_-]+",userName));
      System.out.println("Is "+email+" a valid email address? "+Pattern.matches("[a-z0-9@.-]+",email));
      System.out.println("Is "+password+" a valid password? "+Pattern.matches("[a-zA-z0-9@#$%]+",password));
    }
}