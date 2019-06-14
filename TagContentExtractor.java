import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TagContentExtractor{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Pattern p=Pattern.compile("<(.+)>([^<]+)</\\1>");
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
         boolean match=false;;
         Matcher m = p.matcher(line);
         while (m.find()){
             System.out.println(m.group(2));
             match=true;
         }
         if(!match)
        	 System.out.println("None");
         testCases--;
      }
      in.close();
   }
}