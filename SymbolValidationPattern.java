import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


public class SymbolValidationPattern{
     public static boolean isValidSymbolPattern(String s){
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)==')'){
        		if(!stk.isEmpty()&&stk.peek()=='(')
        			stk.pop();
        		else
        			return false;
        	}
        	else if(s.charAt(i)==']'){
        		if(!stk.isEmpty()&&stk.peek()=='[')
        			stk.pop();
         		else
        			return false;
        	}
        	else if(s.charAt(i)=='}'){
        		if(!stk.isEmpty()&&stk.peek()=='{')
        			stk.pop();
         		else
        			return false;
        	}
        	else
        		stk.push(s.charAt(i));
        }
        if(stk.isEmpty())
        	return true;
        else
        	return false;
     }
     public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
	         String input=sc.next();
	         System.out.println(isValidSymbolPattern(input));
	            }
		sc.close();
	}

}
