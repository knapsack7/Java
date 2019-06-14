import java.io.IOException;
import java.util.Scanner;


public class Handshake {
	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n-->0){
			int per=scan.nextInt();
			System.out.println(per*(per-1)/2);
		}
		scan.close();
		}

}
