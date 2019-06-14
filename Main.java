import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0){
			int N=scan.nextInt();
			int flag=0;
			int[] arr=new int[N];
			for(int i=0;i<N;i++){
				arr[i]=scan.nextInt();
			}
			Arrays.sort(arr);
			for(int i=1;i<N;i++){
				flag+=arr[i]-arr[0];
			}
			System.out.println(flag);
		}
		scan.close();
	}
}
