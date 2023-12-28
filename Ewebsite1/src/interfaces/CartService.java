package interfaces;

import beans.Cart;

public interface CartService {
    public Cart addToCart(String userId, String productId);
    public void deleteFromCart(String userId, String productid);
    public Cart checkout(String userId);
    public double TotalBill (String userId);
}
