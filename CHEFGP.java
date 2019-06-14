import java.util.Scanner;

public class CHEFGP {
    private static int countCharacters(String s,char ch){
    	int temp=0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)==ch)
    			temp++;
    	}
    	return temp;
    } 
    private static String generateString(char ch,int size){
    	String temp="";
    	for(int i=0;i<size;i++)
    		temp+=ch;
    	System.out.println(temp);
    	return temp;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0){
		String s=sc.next();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int countA=countCharacters(s,'a');
		int countB=countCharacters(s,'b');
		String tempA=generateString('a',x);
		String tempB=generateString('b',y);
	}
    sc.close();
	}
}
