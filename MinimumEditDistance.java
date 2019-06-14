import java.util.Scanner;
public class MinimumEditDistance{
	public static int[][] minEditDist(String s1,String s2){
		int[][] table=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++){
			for(int j=0;j<=s2.length();j++){
			    if(i==0)
					table[i][j]=j;
				else if(j==0)
					table[i][j]=i;
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					table[i][j]=table[i-1][j-1];
				else
					table[i][j]=Math.min(Math.min(table[i-1][j],table[i][j-1]),table[i-1][j-1])+1;
			}
		}
		return table;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		int[][] modified=new int[s1.length()+1][s2.length()+1];
		modified=minEditDist(s1,s2);
		for(int i[]:modified){
			for(int j:i){
			    System.out.print(j+" ");
			    }
			System.out.println();
		}
		scan.close();
		}

}
