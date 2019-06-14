import java.net.*;
import java.io.*;
public class MyClient1 {
    public void go(){
    	try{      
    		Socket s=new Socket("localhost",9999);  
    		OutputStreamWriter out=new OutputStreamWriter(s.getOutputStream());  
    		PrintWriter writer=new PrintWriter(out,true);
    		String str="Hello Server";
    		writer.println(str);
    	    s.close();
    		}
    	catch(Exception e){
    		System.out.println(e);
    		}  
    }
    public static void main(String[] args) {
    	new MyClient1().go(); 
    }
}