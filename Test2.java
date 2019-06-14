
public class Test2 {

   
    public static void main(String[] args) {
        displayBits(4);
        displayBits(-4);
    }
    //displays 32 bit pattern equivalent to integers
        public static void displayBits(int x){

            int i,mask;
            for(i=32-1;i>=0;i--){
                mask=1<<i;
                int val=x & mask;
                System.out.print( (val>0)?'1':'0' ); //test and print ith bit
                if(i%8==0)
                    System.out.print(' ');
            }
            System.out.println("\n");
        }
}
