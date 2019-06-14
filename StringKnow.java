import java.util.Scanner;
import java.util.*;
public class StringKnow {
	public static void main(String[] args) {
	System.out.println("Enter the two strings::");
	Scanner sc= new Scanner(System.in);
    String A=sc.nextLine();
    String B=sc.nextLine();
    sc.close();
    int a=A.length();
    int b=B.length();
    int c=a+b;
    System.out.println(c);
    System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
    String dA = A.substring(0, 1).toUpperCase() + A.substring(1);
    String dB = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(dA + " " + dB);
    }
}
