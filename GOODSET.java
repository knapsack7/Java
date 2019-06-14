import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class GOODSET {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			if(n==1)
				System.out.println(1);
			else if(n==2)
				System.out.println("1 3");
			else{
				ArrayList<Integer>list=new ArrayList<Integer>();
				for(int i=n/2+1;i<(n+n/2+1);i++)
					list.add(i);
				int l=(n+n/2+1);
				for(int i=0;i<n;i++){
					for(int j=0;j<n ;j++){
						if(i==j)
							continue;
						else{
							for(int k=0;k<n;k++){
								if(k==i || k==j)
									continue;
								else{
									int x=list.get(i);
									int y=list.get(j);
									int z=list.get(k);
									if(x+y==z){
										list.remove(k);
										list.add(l);
										l++;
									}
								}
							}
						}
					}
				}
				for(int i=0;i<n;i++)
					System.out.print(list.get(i)+" ");
			}
		}
		
	}

}
