import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesApp {
    public static void main(String[] args) throws Exception {
        dispWelcome();
        String userID = "group2";
        String userPass = "123group";
        String inputUser;
        String inputPass;
        int menu;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("\nUsername: ");
            inputUser = kb.nextLine();
            System.out.println("\nPassword: ");
            inputPass = kb.nextLine();

            if (inputUser.equals(userID) && inputPass.equals(userPass)) {
                System.out.println("\nWelcome " + userID + "!\n");
            } else {
                throw new Exception("Invalid user log in. Please try again.");
            }

        } while (!inputUser.equals(userID) || !inputPass.equals(userPass));

        ArrayList<Customer> customers = new ArrayList<Customer>();
        do {
            dispMenu();
            menu = kb.nextInt();
            kb.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("<<  Add Customer >>");
                    System.out.println("Name: ");
                    String name = kb.nextLine();
                    Customer cust = new Customer(name);
                    customers.add(cust);
                    break;
                case 2:
                    if (customers.size() != 0) {
                        System.out.println("<< Buy Fruit >>");

                        System.out.println("Description: ");
                        String desc = kb.nextLine();
                        System.out.println("Price (in USD): ");
                        double price = kb.nextDouble();
                        kb.nextLine();
                        System.out.println("Weight (in pound): ");
                        double weight = kb.nextDouble();
                        kb.nextLine();

                        Groceries fruit = new Fruit(desc, price, weight);
                        customers.get(0).buy(fruit);
                    } else {
                        System.out.println("There is no customer. Please start by entering the customer's name.");
                    }
                    break;
                case 3:
                    if (customers.size() != 0) {
                        System.out.println("<< Buy Canned Food >>");

                        System.out.println("Description: ");
                        String desc = kb.nextLine();
                        System.out.println("Price (in USD): ");
                        double price = kb.nextDouble();
                        kb.nextLine();
                        System.out.println("Type: ");
                        String type = kb.nextLine();
                        System.out.println("Expiry Date: ");
                        String expiredDate = kb.nextLine();

                        Groceries cf = new CannedFood(desc, price, expiredDate, type);
                        customers.get(0).buy(cf);
                    } else {
                        System.out.println("There is no customer. Please start by entering the customer's name.");
                    }
                    break;
                case 4:
                    if (customers.size() != 0 && customers.get(0).calcItemPurchased() != 0) {
                        System.out.println(customers.get(0).toString());
                        customers.get(0).print();
                    } else if (customers.size() == 0) {
                        System.out.println("There is no customer. Please start by entering the customer's name.");
                    } else {
                        System.out.println("No items were purchased!!");
                    }
                    break;
                case 5:
                    System.out.println("Thank you! :)");
                    System.exit(0);
                    break;
                default:
                    throw new Exception("Invalid input!!");

            }

        } while (menu > 0 || menu <= 5);

        kb.close();
    }

    public static void dispWelcome() {
        System.out.println("\n\n ******************************************************");
        System.out.println("          WELCOME TO PERSONAL GROCERY SHOPPER SYSTEM             ");
        System.out.println(" ******************************************************\n");
        System.out.println("Please log in.");
    }

    public static void dispMenu() {
        System.out.println("========== Menu ==========");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Buy Fruit");
        System.out.println("[3] Buy Canned Food");
        System.out.println("[4] Display Grocery Shopping List");
        System.out.println("[5] Exit");
        System.out.println("==========================");
        System.out.print("\nSelect task: ");

    }

}
