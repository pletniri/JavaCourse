public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(56, 35));

    }

//    Shared Digit
//    Write a method named hasSharedDigit with two parameters of type int.

    public static boolean hasSharedDigit(int first, int second){
        if((first < 10 || first > 99) || (second < 10 || second > 99)){
            return false;
        }
        int shared = 0;
        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;
        int firstDigitFirst = first / 10;
        int firstDigitSecond = second /10;
        if((lastDigitFirst == lastDigitSecond || lastDigitFirst == firstDigitSecond) ||
                (firstDigitFirst == firstDigitSecond || firstDigitFirst == lastDigitSecond)) {
            return true;
        }
        return false;

    }

//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers
//    is not within the range, the method should return false.
//
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//    otherwise, the method should return false.



//    Last Digit Checker
//    Write a method named hasSameLastDigit with three parameters of type int.
//
//    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not
//    within the range, the method should return false.
//
//    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

    public static boolean hasSameLastDigit(int first, int second, int third){
        if(!isValid(first)){return false;}
        if(!isValid(second)){return false;}
        if(!isValid(third)){return false;}

        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;
        int lastDigitThird = third % 10;
        if (lastDigitFirst == lastDigitSecond || lastDigitFirst == lastDigitThird || lastDigitSecond == lastDigitThird) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if(number >= 10 && number <=1000){
            return true;
        }
        return false;
    }



//    Write another method named isValid with one parameter of type int.
//
//    The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
//
//    EXAMPLE INPUT/OUTPUT
//
//    isValid(10); → should return true since 10 is within the range of 10-1000
//
//    isValid(468); → should return true since 468 is within the range of 10-1000
//
//    isValid(1051); → should return false since 1051 is not within the range of 10-1000
//
//
//
//    NOTE: All methods need to be defined as public static as we have been doing so far in the course.
//
//    NOTE: Do not add a main method to the solution code.


//    All Factors
//    Write a method named printFactors with one parameter of type int named number.
//
//    If number is < 1, the method should print "Invalid Value".
//
//    The method should print all factors of the number. A factor of a number is an integer
//    which divides that number wholly (i.e. without leaving a remainder).
//
//    For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

    public static void printFactors(int number){
        if(number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++){
            if(number % i == 0) {
                System.out.println(i);

            }
        }
    }


//    EXAMPLE INPUT/OUTPUT:
//
//    printFactors(6); → should print 1 2 3 6
//
//    printFactors(32); → should print 1 2 4 8 16 32
//
//    printFactors(10); → should print 1 2 5 10
//
//    printFactors(-1); → should print "Invalid Value" since number is < 1//
//
//
//    HINT: Use a while or for loop./
//
//
//            NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
//
//    For example, the printout for printFactors(10); can be:
//
//            1
//            2
//            5
//            10
//


//    Greatest Common Divisor
//    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//
//    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//
//    The method should return the greatest common divisor of the two numbers (int).
//
//    The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
////    For example 12 and 30:
//
//            12 can be divided by 1, 2, 3, 4, 6, 12
//
//            30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//
//    The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

  public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) {
            return -1;
        }


  }



//
//    HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
//
//    HINT: Find the minimum of the two numbers.
//
//









}
