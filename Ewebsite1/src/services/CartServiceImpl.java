package services;

import beans.Cart;
import beans.CartEntry;
import beans.Pair;
import interfaces.CartService;

import java.util.ArrayList;
import java.util.List;

public class CartServiceImpl implements CartService {
    Double Totalcost = 0.00;
    List<Cart> carts = new ArrayList<>();
    @Override
    public Cart addToCart(String userId, String productId) {
        Cart cart1 = new Cart();
        boolean userIdPresent = false;
        for (Cart cart : carts) {
            if (cart.getUserId().equals(userId)) {
                userIdPresent = true;
                boolean productIdPresent = false;
                for (CartEntry productPair : cart.getProductInfos()) {
                    if (productPair.getProductInfos().getProductId().equals(productId)) {
                        productIdPresent = true;
                        int count = productPair.getProductInfos().getQuantity();
                        double cost = productPair.getProductInfos().getCost();
                        cost = cost / count;
                        count = count + 1;
                        productPair.getProductInfos().setQuantity(count);
                        productPair.getProductInfos().setCost(cost * count);
                        cart1 = cart;
                    }
                }
                if (productIdPresent == false) {
                    List<CartEntry> productPair = cart.getProductInfos();
                    CartEntry cartEntry = new CartEntry(new Pair<>(productId, 1, 100.00));
                    productPair.add(cartEntry);
                    cart.setProductInfos(productPair);
                    cart1 = cart;
                }
            }
        }

        if (userIdPresent == false) {
            Cart cart = new Cart();
            cart.setUserId(userId);
            List<CartEntry> productPair = cart.getProductInfos();
            CartEntry cartEntry = new CartEntry(new Pair<>(productId, 1, 100.00));
            productPair.add(cartEntry);
            cart.setProductInfos(productPair);
            cart1 = cart;
        }
        carts.add(cart1);
        return cart1;
    }
    @Override
    public void deleteFromCart(String userId, String productid) {
        for (Cart cart : carts) {
            if (cart.getUserId().equals(userId)) {
                for (CartEntry productPair: cart.getProductInfos()) {
                    if (productPair.getProductInfos().getProductId().equals(productid)) {
                        if (productPair.getProductInfos().getQuantity() > 1) {
                            int count = productPair.getProductInfos().getQuantity();
                            double cost = productPair.getProductInfos().getCost();
                            cost=cost/count;
                            productPair.getProductInfos().setQuantity(--count);
                            productPair.getProductInfos().setCost(cost*count);
                        } else {
                            productPair.getProductInfos().setProductId(null);
                            productPair.getProductInfos().setQuantity(null);
                            productPair.getProductInfos().setCost(null);
                        }
                    }
                }
            }
        }
    }
    @Override
    public Cart checkout(String userId) {
        Cart cart1 = new Cart();
        for (Cart cart : carts) {
            if (cart.getUserId().equals(userId)) {
                cart1 = cart;
            }
        }
        return cart1;
    }
    @Override
         public double TotalBill (String userId) {
             for (Cart cart : carts) {
                 if (cart.getUserId().equals(userId)) {
                     for (CartEntry productPair: cart.getProductInfos()) {
                        Totalcost = Totalcost + productPair.getProductInfos().getCost();
                     }
                 }

                 }
        return Totalcost;
    }
}
