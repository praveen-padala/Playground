import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       String[] array = new String[size];
       char char_list[] = new char[size];
       char temp;
       char ch;
       int count = 1;
       String str;
       int i = 0;
       int track[] = new int[size];
       
       
    
    for( count = 0; count < size; count++)
       {
           
            str = in.next();
            
            array[count] = str;
            char_list[count] = array[count].charAt(0);
           
       }
   
      
       
    for(int round = 0; round < size; round++)
       {
           for(int vary = 0; vary < (( size - round) - 1); vary++)
           {
                if(char_list[vary] > char_list[vary + 1])
                {
                     temp = char_list[vary];
                     char_list[vary] = char_list[vary + 1];
                     char_list[vary + 1] = temp;
                }
           }
       }
     for(int index = 0; index < size; index++)
     {
          for(int index2 = 0 ; index2 < size; index2++)
          {
              if(track[index2] != -1)
              {
               if(char_list[index] == array[index2].charAt(0))
               {
                    System.out.println(array[index2].toLowerCase());
                    track[index2] = -1;
                    break;
               }
              }
                     
          }
     }
                  
    
      
   
                     
  }
}