import java.util.*;
class Combination {
    public List<String> getAllCombinations(String s) {
        List<String> list = new ArrayList<>();

        if(s == null || s.length() == 0)    return list;

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        list.add("");

        for(char ch : s.toCharArray()){
            String letters = map[ch - '0'];
            List<String> temp = new ArrayList<>();

            for(String p : list){
                for(char c : letters.toCharArray()){
                    temp.add(p + c);
                }
            }

            list = temp;
        }
        return list;
    }
}


public class LetterCombo_3{
    public static void main(String a[]){
        Combination obj = new Combination();

        System.out.println(obj.getAllCombinations("23"));
    }
}