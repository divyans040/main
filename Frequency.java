import java.util.Locale;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = in.nextLine();
        s = s.toLowerCase();

        //to count letter frequency
        for(char ch='a';ch<='z';ch++){
            int c = 0;
            for(int i=0;i<s.length();i++){
                if(ch==s.charAt(i)){
                    c++;
                }
            }
            System.out.println("Frequency of "+ ch + " is " + c);
        }
    }

}
