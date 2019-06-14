import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TRISQ{
	static int[] arr;	
	public TRISQ(){
		arr=new int[10001];
		arr[0]=0;arr[1]=0;arr[2]=0;arr[3]=0;
		for(int i=4;i<10001;i++){
			int m=i/2;
			arr[i]=(m*(m-1)/2);
		}
	}
	public static int squareFitted(int n){
		return arr[n];
	}
	public static void main(String[] args) throws NumberFormatException,IOException{
		TRISQ tr=new TRISQ();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
			int n=Integer.parseInt(br.readLine());
			System.out.println(squareFitted(n));
		}
	}
}
