public class Refrigerator {

    private boolean hasWorkToDo;



    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Milk is out. Fridge orders milk");
        } else {
            System.out.println("Fridge is full. No job needs to be done");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
