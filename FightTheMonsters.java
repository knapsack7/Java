import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class FightTheMonsters{
	public static void main(String[] args) throws NumberFormatException,IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     String[] s=br.readLine().split(" ");
	     int N=Integer.parseInt(s[0]);
	     Long Hit=Long.parseLong(s[1]);
	     Long T=Long.parseLong(s[2]);
		 String[] s1=br.readLine().split(" ");
		 int killed=0;
		 int[] health=new int[N];
		 for(int i=0;i<N;i++)
			 health[i]=Integer.parseInt(s1[i]);
		 Arrays.sort(health);
		 Long temp;
		 for(int i=1;i<=T;i+=temp){
			temp=((health[i]%Hit)==0)?health[i]/Hit:health[i]/Hit+1;
			killed++;
		 }
		 System.out.println(killed);
		 }
}
