import java.io.*;
class TheSeatingDilemma{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=new String[n*2];
        for(int i=0;i<2*n;i+=2){
            String ss=br.readLine();
            s[i]=ss.substring(0,2);
            s[i+1]=ss.substring(3,5);       
        }
        String match="EE";
        boolean isPossible=false;
        int place=-1;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(match)){
                isPossible=true;
                place=i;               
                break;           
            }       
        }
        if(isPossible){
            System.out.println("YES");
            s[place]="CC";
            for(int i=0;i<s.length;i+=2){
                System.out.println(s[i]+"|"+s[i+1]);
            }       
        }
        else
            System.out.println("NO");                
    }
}
