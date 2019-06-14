import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulArrays {
      static int size;
      static int num[]=new int[size];
      public static void main(String[] args) throws NumberFormatException,IOException{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int T=Integer.parseInt(br.readLine());
		  /*while(T-->0){
			size=Integer.parseInt(br.readLine());
			String[] s=br.readLine().split(" ");
			for(int i=0;i<size;i++)
				num[i]=Integer.parseInt(s[i]);
		  }
		  */for(int i:num)
			  System.out.print(i+" ");
	}

}
