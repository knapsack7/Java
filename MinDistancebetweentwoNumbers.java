public class MinDistancebetweentwoNumbers{
	  public static int getDistance(int[] a,int x,int y){
		  int minDistance=Integer.MAX_VALUE,prev=0,i;
		  for(i=0;i<a.length;i++){
			  if(a[i]==x||a[i]==y){
				  prev=i;
				  break;
			  }
		  }
		  for(i++;i<a.length;i++){
			  if((a[i]==x||a[i]==y)){
				  if(a[i]!=a[prev]&&(i-prev<minDistance)){
					  minDistance=i-prev;
					  prev=i;
				  }
				  else
					  prev=i;
			  }
		}
		return minDistance;		  
	  } 
      public static void main(String[] args) {
		int[] a={2,5,3,5,4,4,2,3};
		System.out.println(getDistance(a,3,2));
	}
}
