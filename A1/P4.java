public class P4{

    void printSeries(int n){
        int a = 0, b = 1, c = 0, power = 2, k = 1;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print((int)Math.pow(2, k) + ", ");
                k++;
            }
        }
    }

    public static void main(String args[]){
        int n = 20;
        P4 obj = new P4();
        obj.printSeries(n);
    }
}