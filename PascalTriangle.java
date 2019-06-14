import java.util.Scanner;
public class PascalTriangle {
	 private static int[] nthRow(int n){
		 if(n==1){
			 int[] result={1};
			 return result;
		 }
		 if(n==2){
			 int[] result={1,1};
			 return result;
		 }
		 int[] previous={1,1};
		 for(int r=3;r<=n;r++){
			 int[] next=new int[r];
			 next[0]=1;
			 for(int j=1;j<r-1;j++){
				 next[j]=previous[j-1]+previous[j];
			 }
			 next[r-1]=1;
			 previous=next;
		 }
		 return previous;
     }
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows for Pascal Triangle\n");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			int[] toPrint=nthRow(i);
		    for(int j:toPrint)
		    	System.out.print(j+" ");
		    System.out.println();
		}
		sc.close();
	}
}
