import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;


public class MyServer2 {
	ArrayList<PrintWriter> clientOutputStreams;
	
	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket){
			try{
				sock=new Socket();
				InputStreamReader isReader=new InputStreamReader(sock.getInputStream());
				reader =new BufferedReader(isReader);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		public void run(){
			String message;
			try{
				while((message=reader.readLine())!=null){
					System.out.println("read "+message);
					tellEveryOne(message);
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException{
			new MyServer2().go();
	}
	
	public void go() throws IOException{
		clientOutputStreams = new ArrayList<PrintWriter>();
		ServerSocket serverSock=null;
		try{
			serverSock=new ServerSocket(9999);
			while(true){
				Socket clientSocket=serverSock.accept();
				PrintWriter writer=new PrintWriter(clientSocket.getOutputStream(),true);
				clientOutputStreams.add(writer);
				
				Thread t=new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("got a connection");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		serverSock.close();
	}
	
	public void tellEveryOne(String message){
		Iterator<PrintWriter> it=clientOutputStreams.iterator();
		while(it.hasNext()){
			try{
				PrintWriter writer=(PrintWriter) it.next();
				writer.println(message);
				writer.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

}
