import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class PrefixNeighbours{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		Arrays.sort(s);
		for(String ch:s)
			System.out.print(ch+" ");
		System.out.println();
		for(int i=n-1;i>=1;i--){
		System.out.println(s[i].length());
		String ch=s[i].substring(0,s[i].length()-1);
		System.out.println(ch);
		if(ch.compareTo(s[i-1])==0){
			System.out.println("#####");
			s[i-1]=" ";
			i--;
		}
		}
		System.out.println();
		long total=0;
		for(String ch:s){
			if(ch.compareTo(" ")!=0){
				for(int i=0;i<ch.length();i++){
					total+=ch.charAt(i);
					}
				}
			System.out.print(ch+" ");
	}
	System.out.println(total);
	}
}