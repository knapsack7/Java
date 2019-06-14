import java.util.*;
public class CaesarCipher{
    public static boolean check(char t){
        return ((t>=65)&&(t<91))||((t>=97) && (t<123));
    }
    public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int N = stdin.nextInt();
      String str = stdin.next();
      int t = stdin.nextInt();
        for(int i=0;i<N;i++){
            if(check(str.charAt(i))){
                   if(str.charAt(i)>=97){
                       System.out.print((char)(97+((str.charAt(i)-97+t)%26)));
                   }
                   else{
                        System.out.print((char)(65+((str.charAt(i)-65+t)%26)));
                   }                              
            }
            else{
            System.out.print((char)(str.charAt(i)));
            }
       }
      stdin.close();         
   }
}