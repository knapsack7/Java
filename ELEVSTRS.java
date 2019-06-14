import java.util.Scanner;


public class ELEVSTRS {
	public static double stairDis(int N,int V1){
		return Math.sqrt(2)*N/V1;
	}
	public static double elevatorDis(int N,int V2){
		return (2.0*N/V2);
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    while(T-->0){
    	int N=sc.nextInt();
    	int V1=sc.nextInt();
    	int V2=sc.nextInt();
    	if(stairDis(N,V1)<elevatorDis(N,V2))
    		System.out.println("Stairs");
    	else
    		System.out.println("Elevator");
    }
    sc.close();
    }
}
