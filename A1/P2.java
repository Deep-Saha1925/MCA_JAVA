public class P2{

    boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    public static void main(String args[]){
        P2 obj = new P2();
        int n = 100;
        System.out.println("Primes are: ");
        for(int i=2; i<=n; i++){
            if(obj.isPrime(i))
                System.out.print(i + ", ");
        }
    }
}