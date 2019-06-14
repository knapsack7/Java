import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pattern{

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any odd number:");
        int n=Integer.parseInt(br.readLine());
        int left=n/2;
        int right=n/2;
       
        for(int i=0;i<(n/2+1);i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    System.out.print('*');
                }else{
                    if(j>=left&&j<=right){
                        System.out.print(' ');
                    }else{
                        System.out.print('*');
                    }
                }
               
               
            }
            if(i!=0){
                left--;
                right++;
            }
            System.out.println();
        }
    }

}