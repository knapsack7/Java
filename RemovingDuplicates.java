import java.util.Scanner;
public class RemovingDuplicates{
	public static String removeDuplicates(String number){
		if(number.length()<2)
			return number;
		char[] characters=number.toCharArray();
		int pos=1;
		for(int i=1;i<number.length();i++){
			int j;
			for(j=0;j<pos;j++){
				if(characters[j]==characters[i]){
					break;
				}
			}
			if(j==pos){
				characters[pos]=characters[i];
				pos++;
				}
			else{
				characters[j]=0;
                pos++;
			}
		}
		return toUniqueString(characters);
		}
	public static String toUniqueString(char[] letters) {
        StringBuilder sb=new StringBuilder(letters.length);
        for(char c:letters){
            if(c!=0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		input=removeDuplicates(input);
		System.out.println(input);
        scan.close();
        for(int i=0;i<input.length();i++){
    		for(int j=i;j<input.length();j++){
                int multi=1,temp=0;
                for(int k=i;k<=j;k++){
                	temp=temp+multi*Character.getNumericValue(input.charAt(k));
                	multi*=10;
                }
                System.out.println(temp);
    		}
    	}
	}
}
