import java.net.*;
import java.io.*;
public class MyServer1 {
    /*
     Let's see a simple of java socket programming in which client sends a text and server receives it.
     */
	public void go(){
		try{
			ServerSocket ss=new ServerSocket(9999);
			Socket s=ss.accept();
			InputStreamReader dis=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(dis);
			String str=br.readLine();
			System.out.println("Message : "+str);
			br.close();
			ss.close();
		}
		catch(IOException io){
			io.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyServer1().go();
	}
}