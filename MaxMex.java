import java.util.Scanner;

public class MaxMex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int lost=0;
			int max=Integer.MIN_VALUE;
			int[] arr=new int[300000];
			for (int i = 0; i < N; i++) {
				int temp=sc.nextInt() ;
				arr[temp]=1;
				if (temp>= max)
					max = temp;
			}
			int i=0,flag=1;
		    if(K==0){
		    	while(i<=max+K){
		    		if(arr[i]!=1){
		    			System.out.println(i);
		    			flag=0;
		    			break;
		    		}
		    	i++;
		    	}
		    	if(flag==1)
		    		System.out.println(i);
		    }
		    else{
		    	while(i<=max+K){
		    		if(arr[i]!=1){
		    			if(++lost>K){
		    				System.out.println(i);
		    			    flag=0;
		    			    break;
		    			}
		    		}
		    	i++;
		    	}
		    	if(flag==1)
		    		System.out.println(i-K+lost);
		    }
		    }
       sc.close();
	}
}

