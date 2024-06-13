import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = in.nextInt();

        try {
            if(age<18){
                throw new YoungerAgeException("You are not eligible for voting");
            }
            else{
                System.out.println("You can successfully vote");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
