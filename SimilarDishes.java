import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SimilarDishes{
	public static int similarCount(String[] x,String[] y){
		int count=0;
		for(String i:x){
			for(String j:y){
				if(i.compareTo(j)==0)
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
		String[] s=br.readLine().split(" ");
		String[] r=br.readLine().split(" ");
		int count=similarCount(s,r);
		if(count>=s.length/2)
			System.out.println("similar");
		else
			System.out.println("dissimilar");
	    }
	}
}
