import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class GridlandMetro{
	public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,Long>metro=new HashMap<String,Long>();
	String s[]=br.readLine().split(" ");
    double cnt=0;
    int n=Integer.parseInt(s[0]);
    int m=Integer.parseInt(s[1]);
    int k=Integer.parseInt(s[2]);
    int[][] matrix=new int[n][m];
    for(int i=0;i<n;i++){
    	for(int j=0;j<m;j++){
    		matrix[i][j]=1;}}
    while(k-->0){
    	   int row , col1,col2;
    	   String s1[]=br.readLine().split(" ");
	       String name=s1[0];
	       col1=Integer.parseInt(s1[1]);
	       col2=Integer.parseInt(s1[2]);
	       long mobnum=Long.parseLong(br.readLine());
	       metro.put(name, mobnum);
	    }
	for(int i=0;i<n;i++)
		    for(int j=0;j<m;j++){
		    	if(matrix[i][j]==1)
		    		cnt++;
		    }
	System.out.print((int)cnt);
	}
}

