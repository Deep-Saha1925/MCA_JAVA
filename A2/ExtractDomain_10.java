import java.util.Scanner;
class ExtractDomain{
    public void extract(String url){
        int firstIdx = url.indexOf(".");
        String slicedStr = url.substring(firstIdx);
        int lastIdx = slicedStr.indexOf('/')+firstIdx;
        System.out.println("DOMAIN: " +url.substring(firstIdx+1, lastIdx));
    }
}

public class ExtractDomain_10{
    public static void main(String a[]){
        ExtractDomain obj = new ExtractDomain();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter url: ");
        String url = sc.nextLine();
        obj.extract(url);
    }
}