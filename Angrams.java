import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Angrams {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		String s2=br.readLine();
		int a[]=new int[26];
		int b[]=new int[26];
		if(s1.length()!=s2.length())System.out.println("Not Anagrams");
		else{
			for(int i=0;i<s1.length();i++){ 
				int x=(int)s1.charAt(i);
				int y=(int)s2.charAt(i);
				if(x>=97)a[x-97]++;
				else a[x-65]++;
				if(y>=97)b[y-97]++;
				else b[y-65]++;
			}
			boolean t=true;
			for(int i=0;i<26;i++){
				if(a[i]!=b[i]){
					System.out.println("Not Anagrams");
					t=false;
					break;
				}
			}
			if(t)System.out.println("Anagrams");
		}
	}

}
 
