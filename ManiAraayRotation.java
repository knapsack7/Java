import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ManiArrayRotation{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        int q=Integer.parseInt(s[2]);
        k=k%n;
        boolean istrue=true;
        int num[]=new int[n];
        String numbers[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)num[i]=Integer.parseInt(numbers[i]);
        int ra[]=new int[n];
        for(int i=0;i<n;i++){
            if( k>=1  && istrue){
                ra[i]=num[n-k];
                k--;
            }else{
                istrue=false;
                ra[i]=num[k];
                k++;
            }
        }
//        for(int i=0;i<n;i++){
//            System.out.print(ra[i]+" ");
//        }
        while(q-->0){
            int l=Integer.parseInt(br.readLine());
            System.out.println(ra[l]);
        }
    }

}