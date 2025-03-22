import java.util.Scanner;

public class items {
    public static void main(String[] args) {
        int[] productsIds = { 10, 20, 30, 40, 50 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the product Ids: ");
        int searchId = scanner.nextInt();
        boolean inshock = false;
        for (int id : productsIds) {
            if (id == searchId) {
                inshock = true;
                break;
            }
        }
        if (inshock) {
            System.out.println("product Id " + searchId + "is in shock.");
        } else {
            System.out.println("product ID " + searchId + " is out the shock ");
        }
        scanner.close();
    }
}