import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class XENRANK {
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t-->0){
		String s[]=br.readLine().split(" ");
		long x=Long.parseLong(s[0]);
		long y=Long.parseLong(s[1]);
		long n=x+y;
		long solution= (n*(n+1))/2+1+x;
		System.out.println(solution);
		
	}
	}
}
