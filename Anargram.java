import java.util.*;
public class Anargram{
	static int fra[]=new int[26];
	static int frb[]=new int[26];
    static boolean isAnagram(String a, String b) {
       if(a.length()!=b.length())
    		return false;
		else{
			for(int i=0;i<a.length();i++){ 
				int x=(int)a.charAt(i);
				int y=(int)b.charAt(i);
				if(x>=97)fra[x-97]++;
				else fra[x-65]++;
				if(y>=97)frb[y-97]++;
				else frb[y-65]++;
			}
			for(int i=0;i<26;i++){
				if(fra[i]!=frb[i]){
					return false;
				}
			}
            return true;
		}
   
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        scan.close();
        boolean ret=isAnagram(a,b);
        System.out.println((ret)?"Anagrams":"Not Anagrams");
    }
}
