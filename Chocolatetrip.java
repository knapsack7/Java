import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chocolatetrip {
	public static int no_of_toffees(int n,int c,int m){
		int buy_toffee=n/c;
		int wrapper=buy_toffee;
		int total_toffee=buy_toffee;
		while((wrapper/m)>0){
			int wrapper_toffee=wrapper/m;
			total_toffee+=wrapper_toffee;
			wrapper=(wrapper%m)+wrapper_toffee;
		}
		return total_toffee;
	}
    public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
        	int ans=0;
        	String[] s=br.readLine().split(" ");
        	int n=Integer.parseInt(s[0]);
        	int c=Integer.parseInt(s[1]);
        	int m=Integer.parseInt(s[2]);
        	ans=no_of_toffees(n,c,m);
        	System.out.println(ans);
        }
	}

}
