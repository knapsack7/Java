import java.io.IOException;
import java.util.Scanner;
public class HackonacciMatrixRotations{
	 public static void main(String[] args) throws NumberFormatException,IOException{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String[][] arr=new String[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if((i*j)%2==0)
						arr[i][j]="X";
					else
						arr[i][j]="Y";
				}
			}
	        scan.close();
	        for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
	        }
		}
}
