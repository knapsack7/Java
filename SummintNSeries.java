import java.io.IOException;
import java.util.Scanner;


public class SummintNSeries{
	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n-->0){
			double sum=0;
			long term=scan.nextLong();
			sum=(term%(Math.pow(10, 9)+7)*term%(Math.pow(10, 9)+7))%(Math.pow(10, 9)+7);
			System.out.println((long)sum);
		}
     scan.close();
	}
}
