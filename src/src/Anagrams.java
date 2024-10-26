import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println("Enter the Strings");
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();

        //Anagrams anagrams= new Anagrams();
        boolean flag=isValidAnagram(s1,s2);
        if(flag) {
            System.out.println("Is Anagaram");
        }else {
            System.out.println("Not Anagram");
        }

    }

    static boolean isValidAnagram(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean status= Arrays.equals(chars1,chars2);
        return status;
    }
}
