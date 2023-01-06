public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(2);

    }


    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        for(int i = 0; i < number; i++) {
                for(int j =0; j < number; j++) {
                    if((i == 1) || (i == number -1)){
                    System.out.print("*");
                } else if ((j == 1) || (j == number -1)){
                        System.out.print("*");
                    } else if(i == j) {
                        System.out.print("*");
                    } else if(j == number - i + 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
        }
    }
}
