public class customer {
    static int id = 0; // shared static id
    int AccountNo;
    String Name;
    int Balance = 0;
    String Password;

    public customer(int accNo, String name, int bal, String pass) {
        id += 11;
        this.AccountNo = accNo;
        this.Name = name;
        this.Balance = bal;
        this.Password = pass;
    }

    // Overloaded constructor for name + password
    public customer(String name, String pass) {
        id += 11;
        this.AccountNo = id;
        this.Name = name;
        this.Password = pass;
        this.Balance = 0;
    }
}
