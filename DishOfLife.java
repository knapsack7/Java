import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DishOfLife {
 public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int T=Integer.parseInt(br.readLine());
	while(T-->0){
		String[] s=br.readLine().split(" ");
		int mountains=Integer.parseInt(s[0]);
		int ingredients=Integer.parseInt(s[1]);
		boolean[] ispossible=new boolean[ingredients+1];
		int[][] description=new int[mountains][ingredients+1];
		int col=0;
		int j=0;
		int island=mountains;
		boolean flag=true;
		while(mountains-->0){
			String[] s1=br.readLine().split(" ");
			for(int i=0;i<s1.length;i++){
				description[j][i]=Integer.parseInt(s1[i]);
		    }
		j++;
		}
		for(int i=0;i<island;i++){
			if(col<ingredients)
				col=0;
			for(int k=1;k<ingredients+1;k++){
				int temp=description[i][k];
				ispossible[temp]=true;
				if(description[i][k]!=0)
					col++;
			}
		}
		for(boolean i:ispossible){
			if(i==false){
				flag=false;
				break;
			}
		}
		//System.out.println(col);
		//for(boolean i:ispossible)
			//System.out.printf(i+" ");
		if(flag&&(col>=ingredients))
			System.out.println("some");
		if(flag&&(col<ingredients))
			System.out.println("all");
		if(flag==false)
			System.out.println("sad");
		}
 }
}
