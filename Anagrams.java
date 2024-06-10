import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean areAnagrams(char[] arr1,char[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        if(n1!=n2){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings ");
        String s1 = in.next();
        String s2 = in.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if(areAnagrams(arr1,arr2)){
            System.out.println("Two strings are anagrams");
        }
        else{
            System.out.println("Two strings are not anagams");
        }
    }
}
