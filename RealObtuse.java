import java.util.Scanner;


public class RealObtuse {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
        	int k=sc.nextInt();
        	int A=sc.nextInt();
        	int B=sc.nextInt();
        	int count1=B-A-1,count2=k-count1-2;
        	System.out.println(count1+" "+count2);
        	if(count1!=count2)
        		System.out.println(Math.min(count1,count2));
        	else
        		System.out.println(0);
        }
        sc.close();
	}

}
