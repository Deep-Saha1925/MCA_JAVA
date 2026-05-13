import java.util.Scanner;
class ReplaceWords {
    public String replace(String text, String[] badWords){
        
        for (String word : badWords) {
            text = text.replaceAll(word, "***");
        }
        return text;
    }
}

public class ReplaceProfanity_6{
    public static void main(String a[]){
        ReplaceWords obj = new ReplaceWords();
        Scanner sc = new Scanner(System.in);

        String[] badWords = {"bad", "ugly", "stupid"};
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println(obj.replace(text, badWords));
    }
}