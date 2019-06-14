import java.io.IOException;
import java.util.Scanner;
public class Hackonacci{
	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner scan=new Scanner(System.in);
		double[] temp=new double[2001];
		temp[1]=1;
		temp[2]=2;
		temp[3]=3;
		for(int i=4;i<21;i++){
			temp[i]=1*temp[i-1]+2*temp[i-2]+3*temp[i-3];
		}
		for(int i=1;i<21;i++){
		System.out.println(i+"="+temp[i]);
		}
        scan.close();
	}
}
