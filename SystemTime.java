public class SystemTime {
    static boolean[] arr = new boolean[10000001];
    public static void main(String[] args) {
        int time1=(int) System.currentTimeMillis(); //find system time before function call and after function call
        for(int i=2;i<10000001;i++){                //and then subtract to get the time used in executing the function
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        int time2=(int) System.currentTimeMillis();
//        System.out.println("Time taken to execute this function is "+(time2-time1)+" millisec");
//        System.out.println("Time taken to execute this function is "+(float)(time2-time1)/1000+" sec");
//       
        //using sieve
        int time3=(int) System.currentTimeMillis(); //find system time before function call and after function call
        calcPrimes(10000000);                        //and then subtract to get the time used in executing the function
        for(int i=2;i<10000001;i++){
            if(arr[i]==false){
                System.out.println(i);
            }
        }
        int time4=(int) System.currentTimeMillis();
       
        System.out.println("Time taken using normal way is "+(time2-time1)+" millisec");
        System.out.println("Time taken using normal way is "+(float)(time2-time1)/1000+" sec");
       
        System.out.println("Time taken sieve of eratosthenes is "+(time4-time3)+" millisec");
        System.out.println("Time taken sieve of eratosthenes is "+(float)(time4-time3)/1000+" sec");
       
       
       
    }
    static boolean isPrime(int n){
        int i;

        if (n==2)
            return true;

        if (n%2==0)
            return false;

        for (i=3;i<=Math.sqrt(n);i+=2)
            if (n%i==0)
                return false;

        return true;
    }
    static void calcPrimes(int N){
        for (int i = 2; i <= (int)Math.sqrt(N); i++){
            if (arr[i] == false){
                for (int j = i * i; j <= N; j += i){
                    arr[j] = true;
                }
            }
        }
    }

}
