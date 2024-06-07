import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.next();
        int start = 0;
        int end = s.length()-1;
        boolean flag = true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(flag);
    }
}
