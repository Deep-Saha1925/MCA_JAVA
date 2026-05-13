class CheckAnagram{
    public boolean isAnagram(String a, String b){
        if(a.length() != b.length())    return false;

        int count[] = new int[26];

        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++){
            if(count[i] != 0)
                return false;
        }

        return true;
    }
}

public class Anagram_5{
    public static void main(String a[]){
        CheckAnagram obj = new CheckAnagram();

        System.out.println(obj.isAnagram("rat", "car"));
    }
}