public class P5{

    void printSeries(int n){
        int a = 0, b = 1, c = 0, k = -1;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(k + ", ");
                k-=3;
            }
        }
    }

    public static void main(String args[]){
        int n = 20;
        P5 obj = new P5();
        obj.printSeries(n);
    }
}