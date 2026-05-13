import java.util.Scanner;
class TitleCase{
    public void convertCase(String s){
        String[] words = s.split(" ");
        String newWord = "";
        for(String w : words){
            newWord += w.substring(0,1).toUpperCase() + w.substring(1) + " ";
        }
        System.out.println(newWord);
    }
}

public class TitleCase_9{
    public static void main(String a[]){
        TitleCase obj = new TitleCase();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        System.out.print("Title case: ");
        obj.convertCase(str);
    }
}