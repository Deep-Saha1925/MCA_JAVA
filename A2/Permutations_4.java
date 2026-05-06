class Permutataion{
    public void findPermutations(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        // rec call
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            String leftPart = s.substring(0, i);
            String rightPart = s.substring(i+1);

            String newStr = leftPart + rightPart;

            findPermutations(newStr, ans+ch);
        }
    }
}

public class Permutations_4{
    public static void main(String a[]){
        Permutataion p = new Permutataion();
        p.findPermutations("abc", "");
    }
}