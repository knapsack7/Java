
public class CommandLineArguments {
    public static void main(String[] args) {
    int largest=(Integer.parseInt(args[0]));
    for(String i:args)
    	if(Integer.parseInt(i)>largest)
    		largest=Integer.parseInt(i);
    System.out.println("Largest Number is: "+largest);
    }

}
