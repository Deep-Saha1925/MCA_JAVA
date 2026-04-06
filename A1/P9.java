public class P9{

    int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    void printSeries(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += (i/fact(i));
            System.out.print( i + "/" + i + "!" + " + ");
        }
        System.out.println(": " + sum);
    }

    public static void main(String args[]){
        int n = 5;
        P9 obj = new P9();
        obj.printSeries(n);
    }
}