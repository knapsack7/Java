package mypack;

public class Balance {
    String name="";
    long bal=0;
    public Balance(String name,long bal){
    	super();
    	this.name=name;
    	this.bal=bal;
    }
    public void show(){
    	System.out.println("Name : "+name+"and Balance : "+bal);
    }
}
