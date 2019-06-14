public class BitManipulationFunctions {
//displays 32 bit pattern equivalent to integers
    public void displayBits(int x){
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
public void encryptUsingXOR(int x){
        int key=0xff11ff11;
        System.out.println("Number ="+x);
        x=x^key;
        System.out.println("Encrypted value ="+x);
        x=x^key;
        System.out.println("Decrypted value ="+x);
    }
    //to check whether a number is even or odd using mask
public boolean isEven(int x){
        int mask=0x1;
        if((x&mask)==0)return true;
        else return false;
    }
    // n=n&(n-1) clears the rightmost set bit of n
    public int clearRightMostSetBit(int x){

        x=x&(x-1);
        return x;
    }

    //since any poer of 2 number will have only 1 bit set in its binary
    //and n&(n-1) clears the rightmost set bit of n
    //hence the only set bit gets cleared and number turns out to be zero
   public int isPowerOf2(int n){
        if( (n&(n-1)) ==0)
            return 1;
        else
            return 0;
    }
    //this method counts number of set bits in O(n) where n is the number of set bits in unsigned integer
    //do not use for signed numbers
   public int countSetBits(int n){
	   int cnt=0;
        while(n!=0){
            cnt++;
            n=n&(n-1);   //clear the rightmost set bit every time
        }
        return cnt;
    }
   //this method counts number of set bits in time << O(n) where n is the number of set bits in unsigned integer
    //the concept is to use a lookup table of size 256
   public int countSetBitsE(int n){
	   int cnt=0;
        int table[]={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,4,5,5,6,5,6,6,7,5,6,6,7,6,7,7,8};
        while(n!=0){
            cnt=cnt+table[n&0xFF];
            n=n>>8;
        }
        return cnt;
    }
   //this method swaps the values of two variables using bitwise xor
   public void swap(){
        int x=234;
        int y=342;
        System.out.println("x ="+x);
        System.out.println("y ="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x ="+x);
        System.out.println("y ="+y);

    }
     //this method find the 2's complement of a number using shift operations
    //LOGIC:scan the bit pattern from right to left and invert all the bits after the first appearance of a bit with value 1
public int twosComplement(int n){
        int i,mask;
        for(i=0;i<=31;i++){
            mask=1<<i;
            if((n & mask)!=0)
                break;          //find the first bit from right with value 1
        }
        for(i=i+1;i<=31;i++){
            mask=1<<i;
            n=n^mask;           //invert the bit
        }
        return n;
    }
}