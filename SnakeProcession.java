import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SnakeProcession{
	public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int R=Integer.parseInt(br.readLine());
    while(R-->0){
    	int L=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String str="";
        boolean snakepro=true;
        for(int i=0;i<L;i++){
        	if(s.charAt(i)=='H'||s.charAt(i)=='T')
        		str+=s.charAt(i);
        }
        if(str.length()!=0){
        	if(str.charAt(0)!='T'&&str.charAt(str.length()-1)!='H')
        	   for(int i=0;i<str.length()-1;i++){
                  if(str.charAt(i)==str.charAt(i+1)){
        	      snakepro=false;
        	      break;
              }
            }
        	else
        		snakepro=false;
        	}
        if(snakepro)
        	System.out.println("Valid");
        else
        	System.out.println("Invalid");
        }
	}
}
