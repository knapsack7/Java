import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer{
   
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String word = "Which one is better, StringTokenizer vs Split?";
        StringTokenizer tokenizer = new StringTokenizer(word);
        System.out.println("Total number of tokens : " + tokenizer.countTokens());
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("Enter date : (XX/XX/XXXX)");
        String date=sc.next();
        StringTokenizer tokens=new StringTokenizer(date,"/");
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
        sc.close();
    }
}


