import java.util.Scanner;


public class MaximumDraws{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n-->0){
			int pair=scan.nextInt();
			if(pair==1)
				System.out.println(2);
			else
				System.out.println(pair+1);
		}
		scan.close();
	}
}
