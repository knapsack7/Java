import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JavaRegex3{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String username = in.nextLine();
         Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");
         Matcher m=p.matcher(username);
         if(m.find())
        	 System.out.println("Valid");
         else
        	 System.out.println("Invalid");
      }
      in.close();
   }
}
         
