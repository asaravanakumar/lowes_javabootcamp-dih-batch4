

// Encapsulation

public abstract class Account {

    // Access Modifiers - default, private, protected, public

    // properties
    protected int id; // 4 bytes
    protected String name; //
    protected String type;

    // default
    public Account() {
        System.out.println("Default Account constructor called...");
//        id = 10;
//        name = "Anil";
//        type = "Savings";
//        balance = 50000.0;
    }

    // overloaded constructor
    public Account(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    // methods / behaviours
    public void openAccount() {
        System.out.println("Default implementation for Open Account");
    }

    public abstract void closeAccount();

    public abstract void printAccountDetails();

//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount;
//    }
//
//    public double checkBalance() {
//        double bal = balance;
//        return bal;
//    }
}
