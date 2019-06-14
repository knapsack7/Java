import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class MyClient2 {
	/**
	 * Developing Client Server Chat Application
	 */
	JTextField outgoing;
	JTextArea incoming;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;

	public void go(){
		JFrame frame=new JFrame("Simple Chat Application");
		JPanel panel=new JPanel();
		incoming=new JTextArea(15,20);
		outgoing=new JTextField(20);
		JButton button=new JButton("send");
		
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		
		JScrollPane scroller=new JScrollPane(incoming);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		button.addActionListener(new SendButtonListener());
		panel.add(scroller);
		panel.add(outgoing);
		panel.add(button);
		setUpNetworking();
		
		Thread readerThread=new Thread(new IncomingReader());
		readerThread.start();
		frame.setLayout(new FlowLayout()); 
		frame.getContentPane().add(panel);
		frame.setSize(400,500);
		frame.setVisible(true);
		
	}
	
	
	public void setUpNetworking(){
		try{
			sock=new Socket("localhost",9999);
			InputStreamReader streamreader=new InputStreamReader(sock.getInputStream());
			reader=new BufferedReader(streamreader);
			writer=new PrintWriter(sock.getOutputStream(),true);
			System.out.println("network established");
		}catch(IOException ex){
			ex.printStackTrace();
		}
	} 
    
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try{
				writer.println(outgoing.getText());
				writer.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			outgoing.setText(" ");
			outgoing.requestFocus();
		}
	}
	
	public class IncomingReader implements Runnable{
		public void run(){
			String message;
			try{
				while((message=reader.readLine())!=null){
					System.out.println("read : "+message);
					incoming.append(message+"\n");
				}
			}catch(Exception ex){
					ex.printStackTrace();
		    }
		}
	}
	public static void main(String[] args) {
		MyClient2 client=new MyClient2();
		client.go();
	}

}
