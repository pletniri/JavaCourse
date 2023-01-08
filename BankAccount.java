public class BankAccount {

    private long accountNumber;
    private long balance;
    private String name;
    private String email;
    private int phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(long amount){
        this.balance = this.balance + amount;
        System.out.println(this.balance);
    }

    public void withdraw(long amount){
        if(amount > this.balance) {
            System.out.println("Cannot withdrwas more than balance. " +
                    "Your balance is " + getBalance());
        }

        System.out.println(this.balance = this.balance - amount);

    }
}
