import java.util.Scanner;
class Method
{
public void displayMessage(String courseName)
{
System.out.printf( "Welcome to the grade book for\n%s!\n",courseName );
} 
}
public class MethodCalling{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the string");
	String nameOfCourse=input.nextLine();
    Method myMethod=new Method();
    System.out.println(); 
    myMethod.displayMessage(nameOfCourse);
    input.close();
}
}
