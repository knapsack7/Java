import java.util.Scanner;
public class SwappingGeneralised{
	public static void main(String[] args) {
	  System.out.println("Enter two numbers:\n");
	  Scanner sc=new Scanner(System.in);
	  String num1=sc.next();
	  String num2=sc.next();
	  System.out.println("Before Swapping.....");
	  System.out.println("Number 1 = "+num1);
	  System.out.println("Number 2 = "+num2);
	  String temp;
	  temp=num1;
	  num1=num2;
	  num2=temp;
	  System.out.println("After Swapping.....");
	  System.out.println("Number 1 = "+num1);
	  System.out.println("Number 2 = "+num2);
	  sc.close();
	  }
}
