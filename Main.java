import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int counter = 1;
//    double sum = 0;
    double min = 0;
    double max = 0;


    while(counter > 0){
        System.out.println("Enter number #" + counter + ":");
        String nextNumber = scanner.nextLine();
        try{
//            int number = Integer.parseInt(nextNumber);
            double number = Double.parseDouble(nextNumber);
            if(number > max){
                max = number;
            } else if((number < min && counter > 1) ||
                    (counter == 1)) {
                min = number;
            }

            counter++;

        } catch (NumberFormatException nfe) {
//            System.out.println("Invalid Number");
            break;
        }

    }
        if(counter > 1) {
            System.out.println("The minimum number entered is: " + min);
            System.out.println("The maximum number entered is: " + max);
        } else {
            System.out.println("No valid data entered");
        }

    }
}