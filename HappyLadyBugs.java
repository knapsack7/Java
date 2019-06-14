import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HappyLadyBugs{
	static boolean execute=false;
	static char ch[];
	public static boolean configure(){
	execute=true;
	boolean state=true;
	for(int i=1;i<ch.length-1;i++){
		if(!(ch[i]==ch[i-1]&&ch[i]==ch[i+1])){
			state=false;
			break;
		}
	}
	if(state){
		System.out.println("YES");
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int g=Integer.parseInt(br.readLine());
		while(g-->0){
			int x=Integer.parseInt(br.readLine());
			ch=br.readLine().toCharArray();
			int cnt[]=new int[27];
			boolean colourwithcount1=false;
			if(ch.length>=2){
				for(int i=0;i<x;i++){
					if((int)ch[i]>=65 && (int)ch[i]<=90){
						cnt[(int)ch[i]-65]++;
					}else{
						cnt[26]++;
					}
				}
			}
			for(int i=0;i<26;i++){
				if(cnt[i]==1){
					colourwithcount1=true;
					break;
				}
			}
			if(configure()==false){
				if(!colourwithcount1&&cnt[26]!=0)
			          System.out.println("YES");
			       else
			          System.out.println("NO");
			    }
			}
		}
}