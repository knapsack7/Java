import java.util.*;
public class SymbolPattern{
	public static boolean isValidSymbolPattern(String str){
		Stack<Character> st=new Stack<Character>();
		if(str==null||str.length()==0)
			return true;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==')'){
				if(!st.isEmpty()&&st.peek()=='(')
					st.pop();
				else
					return false;
			}
			if(str.charAt(i)=='}'){
				if(!st.isEmpty()&&st.peek()=='{')
					st.pop();
				else
					return false;
			}
			if(str.charAt(i)==']'){
				if(!st.isEmpty()&&st.peek()=='[')
					st.pop();
				else
					return false;
			}
			else{
				st.push(str.charAt(i));
			}
		}
		if(st.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String st1="";
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='{'||st.charAt(i)=='}'||st.charAt(i)=='('||st.charAt(i)==')'||st.charAt(i)=='['||st.charAt(i)==']'){
				st1+=st.charAt(i);
			}
		}
		System.out.println(isValidSymbolPattern(st1));
		sc.close();
	}
}
