import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPermutations {
	public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	int[] num=new int[s.length()];
	for(int i=0;i<s.length();i++)
		num[i]=Character.getNumericValue(s.charAt(i));
    long opsize =(long)Math.pow(2,s.length());
    int counter=0;
    for (counter=1;counter<opsize;counter++){
        for (int j=0;j<num.length;j++){
            if((counter&(1<<j))
                System.out.print(num[j]+" ");
        }
        System.out.println();
    }
    }
}
