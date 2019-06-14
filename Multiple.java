import java.util.Scanner;


public class Multiple{
	public static void main(String[] args) {
	int N,i,num=0;
	System.out.println("Enter the whose first 10 multiple you want:");
	Scanner scan=new Scanner (System.in);
    N=scan.nextInt();
    for(i=0;i<=10;i++)
    { 
    	num=N*i;
    	System.out.printf("%d * %d = %d",N,i,num);
    }
}

}
