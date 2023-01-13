public class CoffeeMaker {

    private boolean hasWorkToDo;


    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("CoffeMaker has work to do");
        } else {
            System.out.println("No coffee this morning");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
