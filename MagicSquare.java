import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args) {
		int n,no_tobe_filled=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for Sqare matrix(entered number must be gretear than 0 and an odd)");
		n=sc.nextInt();
		int blocks=n*n,filledblocks=1,i=0,j=n/2;
		int[][] matrix=new int[n][n];
		for(int p=0;p<n;p++)
			for(int q=0;q<n;q++)
				matrix[p][q]=-1;
		matrix[i][j]=1;
		while(filledblocks<blocks){
			if(i==0){
				if(matrix[(i+(n-1))%n][(j+1)%n]==-1){
				  matrix[(i+(n-1))%n][(j+1)%n]=(no_tobe_filled++);
				  i=(i+(n-1))%n;j=(j+1)%n;
				  filledblocks++;}
				else{
					matrix[(i+1)%n][j]=(no_tobe_filled++);
					i=(i+1)%n;
					filledblocks++;
				}
			}
			else{
				if(matrix[(i-1)%n][(j+1)%n]==-1){
				  matrix[(i-1)%n][(j+1)%n]=(no_tobe_filled++);
				  i=(i-1)%n;j=(j+1)%n;
				  filledblocks++;
				}
				else{
					matrix[(i+1)%n][j]=(no_tobe_filled++);
					i=(i+1)%n;
					filledblocks++;
				}
			}
		}
		for(int row[]:matrix){
			for(int ele:row){
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	sc.close();	
    }

}
