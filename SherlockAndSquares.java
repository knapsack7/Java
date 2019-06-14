import java.util.Scanner;
import java.lang.Math;
public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0){
			int count=0,m=1;
			int A=scan.nextInt();
			int B=scan.nextInt();
			int temp=(int)Math.pow(B,0.5);
			while(m<=temp){
				int t=(int)Math.pow(m,2);
			    if(t>=A&&t<=B)
			        count++;
			    m++;
		    }
			System.out.println(count);
		}
	scan.close();
	}
}
