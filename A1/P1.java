public class P1{

    void fibo(int n){
        int a = 0, b = 1, c = 0, sum = 0;
        for(int i=1; i<=n; i++){
            sum += a;
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.print("\nSum is: " + sum);
    }

    public static void main(String args[]){
        int n = 10;
        P1 obj = new P1();
        obj.fibo(n);
    }
}