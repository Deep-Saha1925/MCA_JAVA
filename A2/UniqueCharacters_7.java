import java.util.Scanner;
class Unique {
    public void checkUnique(String s, int[] arr){
        
        boolean isUnique = true;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            int idx = ch - 'a';
            if(arr[idx] == 1){
                isUnique = false;
                break;
            }

            arr[idx] = 1;
        }

        if (isUnique) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("String contains duplicate characters.");
        }
    }
}

public class UniqueCharacters_7 {
    public static void main(String a[]){
        Unique obj = new Unique();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] arr = new int[26];
        obj.checkUnique(str, arr);
    }
}