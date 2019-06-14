import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CircleOfInt{
    static boolean satisfy(int x,int y,int r){
    	if(Math.pow(x,2)+Math.pow(y,2)-Math.pow(r,2)<=0)
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args) throws NumberFormatException,IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    	int r=Integer.parseInt(br.readLine()); 
    	int total=0;
    	int i=0,j=0;
    	for(i=-r;i<=r;i++){
    		for(j=-r;j<=r;j++){
    			if(satisfy(i,j,r)==true){
    				//System.out.println(i+" "+j);
    			total++;
    			}
    			}
    		}
    	System.out.println(total);
     }
}