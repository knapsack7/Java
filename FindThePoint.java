import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindThePoint{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0){
        	String s[]=br.readLine().split(" ");
        	int x1=Integer.parseInt(s[0]);
        	int y1=Integer.parseInt(s[1]);
        	int x2=Integer.parseInt(s[2]);
        	int y2=Integer.parseInt(s[3]);
        	float num=y2-y1;
        	double din=x2-x1;
        	double dis=Math.sqrt(Math.pow(num, 2)+Math.pow(din, 2));
    		double m=num/din;
    		double x3=x1+2*dis*(Math.cos(Math.atan(m)));
    		double y3=y1+2*dis*(Math.cos(Math.atan(m)));
        	System.out.println((int)x3+" "+(int)y3);
        }
	}

}
