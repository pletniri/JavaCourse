public class WhileLoop {

    public static void main(String[] args) {
        int i = 5;
        int evenNum = 0;
        int oddNum = 0;
        while(i <= 20) {
            if(isEven(i)){
                System.out.println(i);
                evenNum++;
                if(evenNum == 5){
                    break;
                }
            } else {
                oddNum++;
            }
            i++;

        }
        System.out.println("The number of even numbers is " + evenNum);
        System.out.println("The number of odd numbers is " + oddNum);

        System.out.println("Sum of 546 digits is: " + sumDigits(546));
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;

            while(number > 9){
            sum = sum + number%10;
            number = number / 10;
        }
            sum = sum + number;
            return sum;
    }
}
