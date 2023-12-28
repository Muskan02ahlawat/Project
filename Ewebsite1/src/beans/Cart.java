package beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String userId = "Id1";
    private List<CartEntry> productInfos = createDefaultProductList();

    private static List<CartEntry> createDefaultProductList() {
        List<CartEntry> productInfo = new ArrayList<>();
        CartEntry cartNew = new CartEntry(new Pair<>("6d25fda3-ea37-4a65-9b72-8e2b2984e8f0",1,100.00));
        productInfo.add(cartNew);
        return productInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CartEntry> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<CartEntry> productInfos) {
        this.productInfos = productInfos;
    }

    public Cart() {
    }
}
