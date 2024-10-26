import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagrams {

    boolean isValidAnagram(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean status= Arrays.equals(chars1,chars2);
        return status;
    }
}
