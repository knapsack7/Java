import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class UtopianTree {
public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
         int n=Integer.parseInt(br.readLine());
            int q=1;
            for(int i=1;i<=n;i++)
                if(i%2!=0)q=q*2;
                else q++;
                System.out.println(q);
        }
    }
}