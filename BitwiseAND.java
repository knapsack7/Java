import java.util.Scanner;
public class BitwiseAND {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int k=scan.nextInt();
			int num=0;
			for(int i=1;i<n;i++){
				for(int j=i+1;j<n+1;j++){
					if((i&j)>num&&(i&j)<k) 
						num=i&j;
				}
			}
			System.out.println(num);
		}
		scan.close();
	}
}
