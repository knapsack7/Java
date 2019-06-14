import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
/*A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 
You have to create another class that extends the abstract class. Then you can create an instance of the new class. */
class MyBook extends Book{
    void setTitle(String s){//Notice that setTitle method is abstract too and has no body.
         this.title=s;     // That means you must implement the body of that method in the child class.
    }
}
public class JavaAbstractClass1{
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}