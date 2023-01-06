public class FlowerToPack {

    public static void main(String[] args) {

//        System.out.println(canPack(2, 1, 5));
//        System.out.println(isPrime(142));
//        System.out.println(isPrime(97));
//        System.out.println(isPrime(89));
//        System.out.println(isPrime(1000));


        System.out.println(getLargestPrime(25));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int smallNeeded = goal % 5;
        int bigNeeded = (goal - smallNeeded) / 5;
        if (bigCount * 5 + smallCount == goal) {
            return true;
            // if we have more flour than goal: it can be because:
            // 1. we have more smallCount
        } else if (((bigCount * 5 + smallCount) > goal) && (bigCount <= bigNeeded && smallCount >= smallNeeded)) {
            return true;
            //3. we have more bigCount and smallCount
        } else if (((bigCount * 5 + smallCount) > goal) && (bigCount > bigNeeded && smallCount >= smallNeeded)) {
            return true;
        }
        //2. we have more bigCount and less smallCount - false anytime;
//        }else if(((bigCount * 5 + smallCount) > goal) && ((bigCount > bigNeeded) && (smallCount < smallNeeded) && ())){
//            return true;
//        }
        else return false;
    }
//    Flour Pack Problem
//    Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
//
//    The parameter bigCount represents the count of big flour bags (5 kilos each).
//
//    The parameter smallCount represents the count of small flour bags (1 kilo each).
//
//    The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//
//    Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
//    The method should return true if it is possible to make a package with goal kilos of flour.
//
//    If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
//    For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since
//    each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5,
//    the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and
//    it's okay if there are additional bags left over.
//
//    If any of the parameters are negative, return false./
//
//    EXAMPLE INPUT/OUTPUT:
//
//    canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//
//            canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//
//            canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//
//    canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
//
//            canPack (-3, 2, 12); should return false since bigCount is negative.

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int i;
        int temp = number;
        boolean prime = false;

        for(i = 2; i <= temp; i++) {
            if(temp % i == 0){
                temp = temp / i;
                i--;
            }
            }
        return i;
    }









//    public static int getLargestPrime(int number) {
//
//        int largestPrime = 2;
//        int secondLargestPrime = 2;
//        int counter = 0;
//
//        // the method should return -1 to indicate an invalid value.
//        if(number <= 1) {
//            return -1;
//        }
//
//        for(int i = 2; i <= number; i++) {
//            if(number % i == 0) {
//                //Check if the first prime number is the number
//                if(counter == 0) {
//                    largestPrime = i;
//                    counter++;
//                }
//                // Check if the i is bigger than the current largest prime and i cannot be divisible by
//                // the previous largest prime number
//                else if((largestPrime < i) && ((i % secondLargestPrime != 0))) {
//                    secondLargestPrime = largestPrime;
//                    largestPrime = i;
//                    counter++;
//                }
//            }
//        }
//        return largestPrime;
//    }

//    public static int getLargestPrime(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int largestPrime = 0;
//        int temp = number / 2;
//        boolean prime = true;
//
//        for (int i = number; i >= 1; i--) {
//            if (number % i == 0) {
//                for (int j = 2; j < number; j++) {
//                    if (i % j == 0) {
//                        prime = false;
//                    } else
//                    { largestPrime = i;
//                    return i;
//                    }
//                }
//            }
//        }
//        return largestPrime;
//    }


//    public static int getLargestPrime(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int largestPrime = 0;
//        int temp = number / 2;
//
//        for (int i = temp; i >= 1; i--) {
//            boolean prime = isPrime(i);
//            if ((prime == true) && (number % i == 0)){
//                largestPrime = i;
//                break;
//            }
//        }
//        return largestPrime;
//    }
//
//


//    public static boolean isPrime(int number){
//        for (int j = 2; j < number /2; j++){
//            if(number % j == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//        public static int largestPrimeFactor(long number) {
//                int i; long copyOfInput = number;
//                for (i = 2; i <= copyOfInput; i++) {
//                    if (copyOfInput % i == 0) {
//                        copyOfInput /= i; i--;
//                    }
//                }
//                return i;
//            } }



//    Largest Prime
//    Write a method named getLargestPrime with one parameter of type int named number.//
//    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//    The method should calculate the largest prime factor of a given number and return it.
//    EXAMPLE INPUT/OUTPUT:
//    getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//    getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//    getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//    getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//    getLargestPrime (-1); should return -1 since the parameter is negative
//    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

//         public static int getLargestPrime(int number) {
//        for (int i = 2; number > i; i++) {
//            while (number > i && number % i == 0) {
//                number = number / i;
//            }
//        }
//        return number;
//    }

}
