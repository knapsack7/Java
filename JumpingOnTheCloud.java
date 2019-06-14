import java.util.Scanner;
public class JumpingOnTheCloud {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
    int[] Cloudtype=new int[n];
    for(int i=0;i<n;i++)
    	Cloudtype[i]=scan.nextInt();
	int E=100,i;
	for(i=0;i<n;i=i+k){
		if(i!=0){
			if(Cloudtype[i]==1)
			E=E-3;
		    else
			E=E-1;
		}
	}
    if(Cloudtype[0]==0)	
	   E=E-1;
    else
	   E=E-3;
    System.out.println(E);
    scan.close();
    }
}
