public class P11{

    int power(int n, int k){
        int p = 1;
        for(int i=1; i<=k; i++)
            p *= n;

        return p;
    }

    public static void main(String args[]){
        P11 obj = new P11();

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(obj.power(n, k));
    }
}