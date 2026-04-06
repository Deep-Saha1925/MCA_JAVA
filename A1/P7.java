public class P7{

    void printSeries(int n){
        int a = 1, b = 1, power = 2, k = 1;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(2*k + ", ");
                k++;
            }else{
                a = a*b;
                System.out.print(a + ", ");
                b++;
            }
        }
    }

    public static void main(String args[]){
        int n = 10;
        P7 obj = new P7();
        obj.printSeries(n);
    }
}