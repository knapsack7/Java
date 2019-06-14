import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BeautifilWord{
		public static boolean isVowel(char ch){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
			return true;
			else
			return false;
		}
		public static void main(String[] args) throws NumberFormatException,IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s=br.readLine();
            char[] ch=s.toCharArray();
            boolean beautiful=true;
            for(int i=0;i<ch.length-1;i++){
            	if(ch[i]==ch[i+1]){
            		beautiful=false;
            		break;
            	}
            	if(isVowel(ch[i])&&isVowel(ch[i+1])){
            		beautiful=false;
            		break;
            	}
            }
            if(beautiful)
            	System.out.print("Yes");
            else
            	System.out.print("No");
	}
}
