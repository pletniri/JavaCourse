import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {

    public static List<String> removeAnagrams(String [] words ) {

        String prev = " ";
        List <String> answer = new ArrayList<>();
        for(int i = 0; i < words.length; i++ ){
            char [] stringOfChars = words[i].toCharArray();
            Arrays.sort(stringOfChars);
            String current = String.valueOf(stringOfChars);
            if(!stringOfChars.equals(prev)) {
                answer.add(words[i]);
            }
        }
        return answer;

    }

    public static int [] sortByBits(int [] array){
        int n = array.length;
         for(int i = 0; i < n; i++) {
             array[i] = array[i] + 1001 * Integer.bitCount(array[i]);
         }
         Arrays.sort(array);

         for(int i = 0; i < n; i++) {
             array[i] = array[i] % 1001;
         }
         return array;

    }
}
