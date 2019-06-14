import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arr66 {
public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] ar= new int[6][6];
        int[] sumnum=new int[8];
        int i, j, sum,max;
        for (i = 0; i < 6; i++) {
        	  String s[]=br.readLine().split(" ");
            for (j = 0; j < 6; j++) {
                          ar[i][j]=Integer.parseInt(s[j]);
                          }
        }
for (i = 0; i <= 4; i++) {
            for (j = 0; j<= 4; j++) {
                sum = ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
                sumnum[i+j]=sum;
                sum=0;
            }
        }
        max=sumnum[0];
        for(i=0;i<8;i++){
    	          if(sumnum[i]>max)
    	        	  max=sumnum[i];
    	          }
        System.out.println(max);
    }
}