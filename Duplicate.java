import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public  class Duplicate {
      static String expanded="";
      public static void wordFormation(){
    	String sinitial="0";
  		String tinitial="";
  		while(expanded.length()<=1000){
  			for(int i=0;i<sinitial.length();i++){
  			if(sinitial.charAt(i)=='0')
  				tinitial+="1";
  			else
  				tinitial+="0";
  		    }
  			//System.out.println(s2);
  			expanded=sinitial+tinitial;
  			//System.out.println(expanded);
  			sinitial=expanded;
  			tinitial="";
  		}
     }
      public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		wordFormation();
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
		   int query=Integer.parseInt(br.readLine());
		   System.out.println(expanded.charAt(query));
		}
		//System.out.println(expanded);
		}

}
