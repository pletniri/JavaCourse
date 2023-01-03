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
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
