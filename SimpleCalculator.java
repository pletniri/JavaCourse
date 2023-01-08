public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){

        double result = firstNumber + secondNumber;
        return result;
    }
    public double getSubtractionResult(){
        double result = firstNumber - secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result = firstNumber * secondNumber;
        return result;
    }
    public double getDivisionResult(){
        double result = 0;
        if(secondNumber == 0) {
            result =  0;
        } else {
            result = firstNumber / secondNumber;
        }
        return result;

    }


}
