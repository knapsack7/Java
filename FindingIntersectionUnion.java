import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class FindingIntersectionUnion{
        static int N;
        public static int[] union(int[] a,int[] b){
        	int i=0,j=0,k=0;
        	N=a.length+b.length;
        	int[] c=new int[N];
        	while(i<a.length&&j<b.length){
        		if(a[i]<b[j])
        			c[k++]=a[i++];
        		else if(a[i]>b[j])
        			c[k++]=b[j++];
        		else{
        			c[k++]=a[i++];
        			j++;
        		}
        	}
        	while(i<a.length)
        		c[k++]=a[i++];
        	while(j<b.length)
        		c[k++]=b[j++];
        	return c;
        }
        public static int[] intersection(int[] a,int[] b){
        	int i=0,j=0,k=0;
        	N=a.length+b.length;
        	int[] c=new int[N];
        	while(i<a.length&&j<b.length){
        		if(a[i]<b[j])
        			i++;
        		else if(a[i]>b[j])
        			j++;
        		else{
        			c[k++]=a[i++];
        			j++;
        		}
        	}
        	return c;
        }
        public static void main(String[] args) throws NumberFormatException,IOException{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String[] s=br.readLine().split(" ");
		    int[] arr1=new int[s.length];
		    for(int i=0;i<s.length;i++)
		    	arr1[i]=Integer.parseInt(s[i]);
		    s=br.readLine().split(" ");
		    int[] arr2=new int[s.length];
		    for(int i=0;i<s.length;i++)
		    	arr2[i]=Integer.parseInt(s[i]);
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    int[] c=intersection(arr1,arr2);
		    System.out.println("Intersection elements(do not consider 0s after real number in output)");
		    for(int i:c)
		    	System.out.print(i+" ");//do not consider 0s after real number in output
		    System.out.println();
		    c=union(arr1,arr2);
		    System.out.println("Union elements(do not consider 0s after real number in output)");
		    for(int i:c)
		    	System.out.print(i+" ");//do not consider 0s after real number in output
		    }

}
