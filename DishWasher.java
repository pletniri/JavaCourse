public class DishWasher {

    private boolean hasWorkToDo;


    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("DishWasher has to start washing dishes");
        } else {
            System.out.println("Dishwasher is empty.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
