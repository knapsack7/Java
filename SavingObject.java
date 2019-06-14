import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Hero implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	public Hero(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println("Name : "+name+" Age : "+age);
	}
}
public class SavingObject {
	public static void main(String[] args)throws Exception {
		Hero h1=new Hero("AKSHAY KUMAR",54);
		Hero h2=new Hero("SALMAN KHAN",55);
		File file=new File("abc.ser");
		FileOutputStream out=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(out);
		os.writeObject(h1);
		os.writeObject(h2);
		os.close();
		FileInputStream in=new FileInputStream(file);
		ObjectInputStream is=new ObjectInputStream(in);
		Hero one=(Hero)is.readObject();
		Hero two=(Hero)is.readObject();
		is.close();
		one.show();
		two.show();

	}

}
