public class Loop {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;
        for (int i = 0; i <= 500; i++)
            {
            if( i % 3 == 0 && i % 5 == 0) {
                System.out.println("The number divided by both 3 and 5 is " + i);
                sum = sum + i;
                counter++;

            }
            if (counter == 5) {
                System.out.println("The sum of all numbers is " + sum);
                break;
                }


        }

//        int counter = 0;
//        for (int number = 0; counter < 3 && number <= 50; number++) {
//
//            if(isPrime(number)){
//                System.out.println(number + " is a prime number");
//                counter++;
////                if(counter == 3) {
////                    break;
////            }
//            }
//        }
//
//
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + " a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + " a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + " a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + " a prime number");
//
//        for (double i = 7.5; i <= 10; i += 0.25) {
//            double interestAmount = calculateInterest(100, i);
//            if (i > 8.5) {
//                break;
//            }
//            System.out.println("100 at " + i + " will be " + interestAmount);
//        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount *(interestRate / 100);
    }

    public static boolean isPrime(int wholeNumber){
        int counter = 0;
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;}
//            } else if(wholeNumber % divisor != 0) {
//                counter++;
//            }

        }
        return true;
    }

    public static boolean isOdd(int number){
        if(number < 0) {
            return false;
        }
        if(number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if(start < 0 || end < 0) {
            return -1;
        }
        if(start > end){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)){
                sum += i;
            }

        }
        return sum;
    }



}
