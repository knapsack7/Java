import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MatrixPrinting{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
    	int[][] binary=new int[n][n];
    	int i=0;
    	int t=n;
    	while(t-->0){
    	    String[] s=br.readLine().split(" ");
    	    for(int j=0;j<n;j++)
    	    	binary[i][j]=Integer.parseInt(s[j]);
    	    i++;
    	}
    	for(int k=0;k<n;k++){
    		for(int j=0;j<n;j++){
    			System.out.print(binary[k][j]+" ");
    		}
    		System.out.println();
    	}
	}
}