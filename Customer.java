public class Customer {

        private String name;
        private double limit;
        private String email;

    public Customer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
        System.out.println("Full constructor called");
    }

    public Customer() {
        this("Irina", 100_000_000, "oiewuroe@sljf.com");
        System.out.println("Empty constructor with a constructor with default values inside called");
    }

    public Customer(String name, String email) {
        this();
        this.name = name;
        this.email = email;
        System.out.println("Constructor with two parameters and inside empty constructor is called");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
