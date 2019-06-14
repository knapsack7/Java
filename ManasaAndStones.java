import java.util.Scanner;
import java.util.TreeSet;
public class ManasaAndStones{
	public static void main(String[] args){
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			for(int i=n-1,j=0;i>=0;i--,j++){
			treeset.add(a*i+b*j);
			}
		    for(int i:treeset){
				System.out.print(i+" ");
			}
			System.out.println();
			treeset.clear();
		}
		scan.close();
    }
}
