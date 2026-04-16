public class P3{

    void fibo(int n){
        int a = 0, b = 1, c = 0, count = 0;
            while(count < n){
            c = a + b;
            if(isPrime(c)){
                System.out.print(c + ", ");
                count++;
            }
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

        obj.fibo();
    }
}