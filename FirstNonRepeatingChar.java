import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = in.next();
        int index = -1;
        char fnc = ' ';

        if(s.isEmpty()){
            System.out.println("Empty string");
        }

        for(char i : s.toCharArray()){
            if(s.indexOf(i)==s.lastIndexOf(i)){
                fnc = i;
                break;
            }
            else{
                index++;
            }
        }

        if(index==s.length()-1){
            System.out.println("All characters are repeating");
        }
        else{
            System.out.println("First non repeating character is " + fnc);
        }
    }
}
