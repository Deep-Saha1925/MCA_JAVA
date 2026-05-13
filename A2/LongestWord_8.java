import java.util.Scanner;
class LongestWord {
    public String findLongestWord(String s){
        
        String[] words = s.split(" ");
        int wLen = -1;
        String longestWord = "";

        for(String w : words){
            if(w.length() > wLen){
                longestWord = w;
                wLen = w.length();
            }
        }

        return longestWord;
    }
}

public class LongestWord_8 {
    public static void main(String a[]){
        LongestWord obj = new LongestWord();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        System.out.println("Longest Word: " + obj.findLongestWord(str));
    }
}