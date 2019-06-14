import java.io.IOException;
import java.util.Scanner;


public class BrianApp {
	public static void main(String[] args) throws NumberFormatException,IOException{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	int[] item_price=new int[n];
	for(int i=0;i<n;i++)
		item_price[i]=scan.nextInt();
	int anna_charge=scan.nextInt();
	int total_charge=0;
	for(int i=0;i<n;i++){
		if(i!=k)
		total_charge =total_charge + item_price[i];
	}
	if(anna_charge==total_charge/2)
		System.out.println("Bon Appetit");
	else
		System.out.println(anna_charge-total_charge/2);
	scan.close();
	}

}
