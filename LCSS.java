import java.util.HashMap;
import java.util.Map;


public class LCSS{
     public static void main(String[] args) {
    	 byte arr1[]={1, 0, 0, 1, 1, 0};
    	 byte arr2[]={0, 1, 1, 0, 1, 1};;
    	 Map<Integer,Integer> MyMap=new HashMap<Integer,Integer>();
    	 int prefix1=0,prefix2=0,maxLen=0;
    	 for(int i=0;i<arr1.length;i++){
    		 int sumdiff=0;
    		 prefix1+=arr1[i];
    		 prefix2+=arr2[i];
    		 sumdiff=prefix1-prefix2;
    		 MyMap.put(0,-1);
    		 if(MyMap.containsKey(sumdiff)){
    			 maxLen=Math.max(maxLen, i-MyMap.get(sumdiff));
    		 }
    		 else{
    			 MyMap.put(sumdiff, i);
    		 }
    	 }
    	 System.out.println(maxLen);
	}

}
