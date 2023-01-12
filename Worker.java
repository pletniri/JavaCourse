public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public int getAge(){
        int currentYear = 2023;
        int birth = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birth);
    }

    public double collectPay(){
        double salary = 300;
        return salary;

    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        System.out.println("You are fired at " + endDate);

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
