import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeftRotateTheArray{
    public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int size=Integer.parseInt(s[0]);
		int[] num=new int[size];
		int times=Integer.parseInt(s[1]);
		String[] s1=br.readLine().split(" ");
		for(int i=0;i<size;i++)
			num[i]=Integer.parseInt(s1[i]);
		times%=size;
		while(times-->0){
			int temp=num[0];
			for(int i=0;i<size-1;i++)
				num[i]=num[i+1];
			num[size-1]=temp;
		}
		for(int i:num)
			System.out.printf(i+" ");
	}

}
