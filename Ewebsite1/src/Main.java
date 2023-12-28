import beans.User;
import interfaces.CartService;
import interfaces.InventoryManagementService;
import interfaces.UserActionService;
import services.CartServiceImpl;
import services.InventoryManagementServiceImpl;
import services.UserActionServiceImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       /* System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }*/
        UserActionService userActionService = new UserActionServiceImpl();
        CartService cartService = new CartServiceImpl();
        User user = new User("id1","name","password");
        userActionService.createUser(user);
        InventoryManagementService inventoryManagementService = new InventoryManagementServiceImpl();
        inventoryManagementService.createProduct("abc",3);
        cartService.addToCart("id1","6d25fda3-ea37-4a65-9b72-8e2b2984e8f0");
        cartService.TotalBill("id1");
    }

}