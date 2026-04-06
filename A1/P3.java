public class P3{

    void fibo(int n){
        int a = 0, b = 1, c = 0, count = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(a) && count < 8){
                System.out.print(a + ", ");
                count++;
            }
            c = a + b;
            a = b;
            b = c;
        }
    }


    boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    public static void main(String args[]){
        P3 obj = new P3();
        int n = 100;

        obj.fibo(n);
        
        // for(int i=2; c <= 8; i++, c++){
        //     int f = obj.fibo(i);
        //     if(obj.isPrime(f))
        //         System.out.print(i + ", ");
        // }


    }
}