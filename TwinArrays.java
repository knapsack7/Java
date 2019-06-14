import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TwinArrays{
    public static void main(String[] args) throws NumberFormatException,IOException{
      	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int N=Integer.parseInt(br.readLine());
         String[] s=br.readLine().split(" ");
         int[] arrA=new int[N];
         int[] arrB=new int[N];
         for(int i=0;i<N;i++)
        	 arrA[i]=Integer.parseInt(s[i]);
         s=br.readLine().split(" ");
         for(int i=0;i<N;i++)
        	 arrB[i]=Integer.parseInt(s[i]);
         int no1=arrA[0],addA=0,no2=arrB[0],addB=0,no3=0,no4=0;
         for(int i=1;i<N;i++){
        	if(arrA[i]<=no1){
        		no1=arrA[i];
        		addA=i;
        	 }
         }
        no3=no1;
        arrA[addA]=Integer.MAX_VALUE;
        //System.out.println(no1+ " addA "+addA);
        for(int i=1;i<N;i++){
         	if(arrB[i]<=no2){
         		no2=arrB[i];
         		addB=i;
         	 }
          }
        no4=no2;
        //System.out.println(no2+" addB "+addB);
        if(addA==addB){
           Arrays.sort(arrA);
           for(int i=0;i<N;i++){
        	   if(arrA[i]>=no1){
        	   no3=arrA[i];
        	   break;
        	   }
           }
           Arrays.sort(arrB);
           for(int i=1;i<N;i++){
        	     if(arrB[i]>=no2){
        		 no4=arrB[i];
        		 break;
                 }
               }
           }
        if(addA==addB){
        int[] C={no1,no3,no4};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		if((i!=j)&&(C[i]+C[j]<min)){
        			min=C[i]+C[j];
        		}
        	}
        }
        System.out.println(min);
        }
        else{
        int[] C={no1,no2};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<2;i++){
        	for(int j=0;j<2;j++){
        		if((i!=j)&&(C[i]+C[j]<min)){
        			min=C[i]+C[j];
        		}
        	}
        }
//        for(int i:C)
//        	System.out.print(i+" ");
        //System.out.println();
        System.out.println(min);
        }
        
}
}
