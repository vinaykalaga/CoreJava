import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Strings");
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();

        Anagrams anagrams= new Anagrams();
        boolean flag=anagrams.isValidAnagram(s1,s2);
        if(flag) {
            System.out.println("Is Anagaram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}