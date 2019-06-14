import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HackerrankInAString{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		char[] s={'h','a','c','k','e','r','r','a','n','k'};
		while(n-->0){
		String s1=br.readLine();
		char[] str=s1.toCharArray();
		int sit=0,temp=1,add=0;
		for(int i=0;i<str.length;i++){
			if(str[i]=='h'){
				add=i;
				sit=1;
				str[i]=' ';
				break;
			}
		}
		//for(char i:str)
			//System.out.print(i);
		//System.out.println(sit+" "+add);
		if(sit==1){
			int j=1;
			while(j<10){
				char ch=s[j];
				for(int i=0;i<str.length;i++){
					if(str[i]==ch&&i>add){
						str[i]=' ';
						add=i;
						temp++;
						//System.out.println(" "+add);
						//System.out.println(str);
						break;
					}
				}
			j++;
			}
		}
		//System.out.println(temp);
		if(temp==10)
			System.out.println("YES");
		else
			System.out.println("NO");
	 }
	}
}