import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IsItASnake {
	    static int n, X=0,Y=0;;
	    static char ch[][]=new char[2][n];
        public static void main(String[] args)throws NumberFormatException,IOException{
          	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             int T=Integer.parseInt(br.readLine());    
             while(T-->0){
            	 n=Integer.parseInt(br.readLine());
                 String s=br.readLine();
                 ch[0]=s.toCharArray();
                 String s1=br.readLine();
                 ch[1]=s1.toCharArray();
                 int y0temp=n-1,y1temp=n-1,x0size=0,x1size=0;
                 int count1=0,count2=1;
                 for(int i=0;i<2;i++)
                	 for(int j=0;j<n;j++)
                		 if(ch[i][j]=='#'){
                			 if(i==0)
                				 x0size++;
                			 else
                				 x1size++;
                			 count1++;
                		 }
                 for(int i=0;i<2;i++){
                	 for(int j=0;j<n;j++){
                		 if(ch[i][j]=='#'){
                			 if(i==0){
                				 y0temp=j;
                				 break;
                			 }
                			 if(i==1){
                				 y1temp=j;
                			     break;
                			 }
                		 }
                	 }
                }
                 if(y0temp<y1temp){
                	 X=0;Y=y0temp;
                 }
                 else if(y0temp>y1temp){
                     X=1;Y=y1temp;
                  }
                 else{
                     if(x0size<x1size){
                    	 X=0;Y=y0temp;
                     }
                    else{
                    	X=1;Y=y0temp;
                    }
                  }
                System.out.println(y0temp+" "+y1temp+" "+x0size+" "+x1size+" "+X+" "+Y+" "+count1+" "+count2);
                while(count2!=count1){
                	 if(isMoveRight()||isMoveDown()||isMoveUp()){
                		 if(isMoveDown()){
                			 System.out.println("Down");
                			 ch[X][Y]='.';
                			 X=X+1;count2++;
                		 }
                		 else if(isMoveUp()){
                			 System.out.println("Up");
                			 ch[X][Y]='.';
                			 X=X-1;count2++;
                		 }
                		 else if(isMoveRight()){
                			 System.out.println("Right");
                			 ch[X][Y]='.';
                			 Y=Y+1;count2++;
                		 }
                	   }
                	 else
                		 break;
                	 System.out.println(count2);
                 }
                for(char[] i:ch)
                	System.out.println(i);
                if(count1==count2)
               	 System.out.println("yes");
                else
                	System.out.println("no");
               	 }
             }
        public static boolean isMoveRight(){
        	if((Y+1<=n-1)&&(ch[X][Y+1]=='#'))
        		return true;
        	else
        		return false;
        }
        public static boolean isMoveDown(){
        	if((X+1<=1)&&(ch[X+1][Y]=='#'))
        		return true;
        	else
        		return false;
        }
        public static boolean isMoveUp(){
        	if((X-1>=0)&&(ch[X-1][Y]=='#'))
        		return true;
        	else
        		return false;
        }
    
}
