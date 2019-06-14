public class ArrangeNumber {
	public static void main(String[] args) {
	int[] myNumber ={24,56,73,12,87,64,98,109,354,126};	
    int max1= 0;
    for(int i=0; i<myNumber.length;i++){
     if (myNumber[i]>max1)
    	 max1=myNumber[i];
    }
    System.out.println("maximum number is::"+ max1);
	}

}
