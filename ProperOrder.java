import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ProperOrder {
public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		boolean is=true;
		for(int i=1;i<s.length();i++){
			int a=Character.getNumericValue(s.charAt(i));
			int b=Character.getNumericValue(s.charAt(i-1));
			if(a<b){
				is=false;
				break;
			}
		}
		System.out.println(is);
	}
}
