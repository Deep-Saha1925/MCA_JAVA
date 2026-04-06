public class P12{

    void factor(int n){
        int p = 1;
        for(int i=1; i<=n; i++)
            if(n%i == 0)
                System.out.print(i+", ");
    }

    public static void main(String args[]){
        P12 obj = new P12();

        int n = Integer.parseInt(args[0]);
        obj.factor(n);
    }
}