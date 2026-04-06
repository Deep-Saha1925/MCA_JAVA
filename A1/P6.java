public class P6{

    int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String args[]){
        int n = 5;
        P6 obj = new P6();
        System.out.println("Factorial is: " + obj.fact(n));
    }
}