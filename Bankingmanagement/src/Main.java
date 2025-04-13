import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, customer> customers_details = new HashMap<>();
        boolean loop = true;

        while (loop) {
            System.out.println("Enter Your Option\n1.New Customer\n2.Existing Customer\n3.Show\n4.Exit");
            int opt = s.nextInt();
            s.nextLine(); // ⚠️ FIX: consume leftover newline

            switch (opt) {
                case 1:
                    while (true) {
                        System.out.println("Enter Your Name : ");
                        String name = s.nextLine();

                        System.out.println("Enter Your Password : ");
                        String pass1 = s.nextLine();

                        System.out.println("Confirm Your Password : ");
                        String pass2 = s.nextLine();

                        if (pass1.equals(pass2)) {
                            customer people = new customer(name, pass1);
                            customers_details.put(people.AccountNo, people); // ⚠️ FIX: use AccountNo instead of static id
                            break;
                        } else {
                            System.out.println("Your Password didn't match with confirm password :)\nPlease Re-Enter the valid password. Thank You!");
                        }
                    }
                    break;

                case 2:
                    // logic placeholder
                    break;

                case 3:
                    System.out.println("Customer Details are : ");
                    System.out.println("CustId  AccountNo   Name   Balance   EncryptedPwd");
                    for (Map.Entry<Integer, customer> people : customers_details.entrySet()) {
                        customer c = people.getValue();
                        System.out.println(customer.id + "|" + c.AccountNo + "|" + c.Name + "|" + c.Balance + "|" + c.Password);
                    }
                    break;

                case 4:
                    System.out.println("Exiting :)");
                    loop = false;
                    break;
            }
        }
    }
}
