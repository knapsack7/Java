import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class ChefAndTheFeast{
       public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer T=Integer.parseInt(br.readLine());
        while(T-->0){
	      int N=Integer.parseInt(br.readLine());
	      String[] s=br.readLine().split("\\s+");
	      long[] happ=new long[N];
	      long happiness=0;
	      boolean isallnegative=true;
	      for(int i=0;i<N;i++){
	    	  happ[i]=Integer.parseInt(s[i]);
	    	  if(happ[i]<=0){
	    		  happiness+=happ[i];
	    	  }
	    	  if(happ[i]>0){
	    		  isallnegative=false;
	    	  }
	    		  
	      }

	      if(isallnegative)
	    	  System.out.println(happiness);
	      else{
	    	  Arrays.sort(happ);
		      for(int i=0,j=N-1;i<N/2;i++,j--){
		    	  long temp=happ[i];
		          happ[i]=happ[j];
		          happ[j]=temp;
	          }
	    	  long sumofpositive=0,product=0;
	    	  int i=0,add=0;
	    	  for(;i<N&&happ[i]>0;i++){
	    		  sumofpositive+=happ[i];
	    	  }
	    	  product=sumofpositive*(i);
	    	  add=i;
	    	  long temp=0;
	    	  if(add<=N-1){
	    		  sumofpositive+=happ[add];
	    	      while((add<=N-1&&((sumofpositive)*(add+1))>=product)){
	    	    	temp=(sumofpositive)*(add+1);
	    	    	product=temp;
	    	    	add++;
	    	    	sumofpositive+=happ[add];
	    	    }
	    	    for(int k=add;k<happ.length;k++)
	    		  temp+=happ[k];
	    	    System.out.println(temp);
	            }
	    	  else
	    		  System.out.println(product);
	      }
	      
	   }
  }
}