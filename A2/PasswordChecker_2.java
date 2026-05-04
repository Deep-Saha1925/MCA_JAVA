class Checker{
    public int checkPassword(char[] str, int n){
        if(n < 4) return 0;

        if(Character.isDigit(str[0]))  return 0;

        boolean hasDigit = false, hasCapital = false;

        for(int i=0; i<n; i++){
            if (str[i] == ' ' || str[i] == '/'){
                return 0;
            }

            if (Character.isDigit(str[i])){
                hasDigit = true;
            }

            if(Character.isUpperCase(str[i])){
                hasCapital = true;
            }
        }

        if (hasCapital && hasDigit) return 1;

        return 0;
    }
}

public class PasswordChecker_2{
    public static void main(String[] args) {
        Checker c = new Checker();

        String input = "aA1_67";
        System.out.println(c.checkPassword(input.toCharArray(), input.length()));

        String input2 = "a987 abC012";
        System.out.println(c.checkPassword(input2.toCharArray(), input2.length()));
    }
}