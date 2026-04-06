public class P8{

    int gcd(int a, int b){
        int g = 1;
        for(int i=1; i<=Math.min(a, b); i++){
            if(a%i == 0 && b%i == 0){
                g = i;
            }
        }
        return g;
    }

    public static void main(String args[]){
        int n = 20;
        P8 obj = new P8();
        System.out.println(obj.gcd(12, 6));
    }
}