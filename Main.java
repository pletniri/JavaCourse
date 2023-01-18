import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int [] array = {23, 56, 6, 9, 123, 56};
       // System.out.println(Arrays.toString(reverseArray(array)));
        reverse(array);
//        int [] unsortedArray = getRandom(20);
//        System.out.println(Arrays.toString(unsortedArray));
//
//        int [] reversed = arrayChallenge(unsortedArray);
//        System.out.println(Arrays.toString(reversed));

//        System.out.println(arrayChallenge());


//        String s = new String();
//        s = "((){}[])";
//        System.out.println(isValid(s));
//        int[] digits = new int [] {1,5,4,7,6,5,3,1};
//        String s = "ajkhg;auaewproitkjdfh";
//        System.out.println(longestPalindrome(s));

//       nextPermutation(digits);
//        System.out.println(Arrays.toString(digits));

    }

    private static int [] reverseCopy(int [] array) {
        int [] reversedCopy = new int [array.length];
        int maxIndex = array.length -1;
        for ( int el : array) {
            reversedCopy[maxIndex--] = el;
        }
        return reversedCopy;
    }

    public static int reverseArray( int [] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array){
            if(el < min){
                min = el;
            }

        }
        return min;
    }

    private static void reverse (int [] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length /2;

        for (int i =0; i < halfLength; i++ ) {
            int temp = array [i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }

    public static int [] getRandom(int len) {
        Random random = new Random();

        int[] s = new int[len];
        for (int i = 0; i < len; i++) {
            s[i] = random.nextInt(1000);
        }
        return s;
    }

    public static int [] arrayChallenge(int [] s){
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int [] tempArray = s;
        int i = tempArray[0];
        int length = tempArray.length -1;
        int j = tempArray[length];
        while ( i < j) {
            int temp =  i;
            i = j;
            j = i;
            i++;
            j--;
        }
        return tempArray;

    }



    //created a map with all possible characters
    static final Map<Character, Character> map = Map.of('(', ')',
                '[', ']',
                '{', '}');
        public static boolean isValid (String s){
            //created a stack from which it is handy to take the last put there character
            Stack<Character> stack = new Stack<>();
            //loop where character c is going to be one or another character
            for (char c : s.toCharArray()) {
                // if we have this character as a key in the map we put in the stack
                if (map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    //if we do not have this character as a key and the stack is not empty we put the last character in the
                    //stack in a variable val
                    char val = stack.pop();
                    //if key and value are not equal return false, otherwise go to the next character
                    if (map.get(val) != c) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }




//    public static String longestPalindrome(String s) {
//        if (s == null || s.length() < 1) return " ";
//
//        if (s.length() == 1) {
//            return s;
//        }
//
//        String longest = s.substring(0, 1);
//
//        for (int i =0; i < s.length(); i++) {
//            String tmp = helper (s, i, i);
//            if(tmp.length() > longest.length()) {
//                longest = tmp;
//            }
//            tmp = helper(s,i, i +1);
//            if(tmp.length() > longest.length()) {
//                longest = tmp;
//            }
//        }
//        return longest;
//    }
//    public static String helper(String s, int begin, int end) {
//        while (begin >= 0 && end <= s.length() -1 && s.charAt(begin) == s.charAt(end)) {
//            begin--;
//            end++;
//        }
//
//        return s.substring(begin +1, end);
//    }


//    public static int minSubArrayLen(int s, int[] nums) {
//        int n = nums.length;
//        int ans = Integer.MAX_VALUE;
//        int left = 0;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            while (sum >= s) {
//                ans = Math.min(ans, i + 1 - left);
//                sum -= nums[left++];
//            }
//        }
//        return (ans != Integer.MAX_VALUE) ? ans : 0;
//    }
//

//    public static void nextPermutation(int[] nums) {
//        int i = nums.length - 2;
//        //this loop cheks if the digits in an acsending order. The last one should be smaller the the previous one.
//        // if not, the code goes to the second loop
//        //3 4 5 2 while 5 is more than the digit after, i  goes to the left
//        // when i finds the number less then i + 1, loop stops and the second loop starts
//        while (i >= 0 && nums[i + 1] <= nums[i]) {
//            i--;
//        }
//        if (i >= 0) {
//            /// j starts at the last position of the array
//            //while j is less than i loop is going
//            int j = nums.length - 1;
//            while (j >= 0 && nums[j] <= nums[i]) {
//                j--;
//            }
//            swap(nums, i, j);
//        }
//        reverse(nums, i + 1);
//    }
//
//    private static void reverse(int[] nums, int start) {
//        int i = start, j = nums.length - 1;
//        while (i < j) {
//            swap(nums, i, j);
//            i++;
//            j--;
//        }
//    }
//
//    private static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }





}