import java.util.Scanner;
public class CoinChangeProblem{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String[] s=scan.nextLine().split(" ");
		int total=Integer.parseInt(s[0]);
		String[] coins=scan.nextLine().split(" ");
		long[][] dpTable = new long[coins.length][total + 1];
		for(int i=0;i<coins.length;i++)
			dpTable[i][0]=Integer.parseInt(coins[i]);
		System.out.println(getWays(dpTable));
		scan.close();
	}
	private static long getWays(long[][] dpTable){
		for(int j=1;j<dpTable[0].length;j++){
			for(int i=0;i<dpTable.length;i++){
				int coinVal=(int)dpTable[i][0];
				long currentVal=(i-1>=0)?dpTable[i-1][j]:0;
				if(j==coinVal)
					currentVal++;
				if (j>coinVal)
					currentVal+=dpTable[i][j-coinVal];
				dpTable[i][j] = currentVal;
			}
		}
		return dpTable[dpTable.length-1][dpTable[0].length -1];
	}
}