import java.util.*;

class Product {
    int id;
    String name;
    int qty;

    Product(int i, String n, int q) {
        id = i;
        name = n;
        qty = q;
    }

    void show() {
        System.out.println(id + " - " + name + " - " + qty);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add  2.View  3.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Qty: ");
                int q = sc.nextInt();

                list.add(new Product(id, name, q));
                System.out.println("Added!");
            }

            else if (choice == 2) {
                if (list.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    for (Product p : list) {
                        p.show();
                    }
                }
            }

        } while (choice != 3);

        sc.close();
    }
}