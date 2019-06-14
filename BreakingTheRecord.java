import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BreakingTheRecord {
public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int no_of_games=Integer.parseInt(br.readLine());
	String[] s=br.readLine().split(" ");
	int min=Integer.parseInt(s[0]),max=Integer.parseInt(s[0]),min_cnt=0,max_cnt=0;
	for(int i=1;i<no_of_games;i++){
		if(Integer.parseInt(s[i])>max){
			max_cnt++;
			max=Integer.parseInt(s[i]);
		}
		if(Integer.parseInt(s[i])<min){
			min_cnt++;
			min=Integer.parseInt(s[i]);
		}
	}
	System.out.println(max_cnt+" "+min_cnt);
}

}
