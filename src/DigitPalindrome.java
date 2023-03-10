public class DigitPalindrome {
    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(438));
        getEvenDigitSum(123456789);




    }

//    Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number.
//    For example: 121, 12321, 1001 etc.
//
//            Tip: Logic to check a palindrome number

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int spareNumber = number;
        if(number > 0) {
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        } } else if (number < 0) {
            while(number < 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number = number / 10;
        }}

        if (spareNumber == reverse) {
            return true;
        }
        return false;

    }

//    Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//
//    If both are the the same then the number is a palindrome otherwise it is not.
//
//    Tip: Logic to reverse a number
//
//    Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//    Extract the last digit of the given number by performing the modulo division (remainder).
//    Store the last digit to some variable say lastDigit = num % 10.
//    Increase the place value of reverse by one.
//    To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//    Add lastDigit to reverse.
//    Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//    Repeat steps until number is not equal to (or greater than) zero.
//
//    A while loop would be good for this coding exercise.
//
//
//
//    Tip: Be careful with negative numbers. They can also be palindrome numbers.
//
//    Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
//
//
//
//    NOTE: The method isPalindrome needs to be defined as public static like we have been doing


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number <= 9){
            lastDigit = number;
            firstDigit = number;
        } else {
        while (number >= 10) {
            number = number / 10;
            firstDigit = number % 10;

        }}

        sum = lastDigit + firstDigit;
        return sum;
    }

//    Even Digit Sum
//    Write a method named getEvenDigitSum with one parameter of type int called number.
//
//    The method should return the sum of the even digits within the number.
//
//    If the number is negative, the method should return -1 to indicate an invalid value.

    public static int getEvenNumberSum(int number){
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        for(int i = 0; i <= number; i++)
           if(i % 2 == 0) {
                sum += i;
             }
        return sum;
    }

    public static int getEvenDigitSum(int number){
        int digit = 0;
        int sum = 0;
        if(number < 0) {
            return -1;
        }

        while(number > 0) {
            digit = number % 10;
            number = number / 10;
            if(digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;

    }

    }
