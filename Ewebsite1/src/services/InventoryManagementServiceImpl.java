package services;

import beans.Product;
import interfaces.InventoryManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class InventoryManagementServiceImpl implements InventoryManagementService {


List<Product> ProductList = new ArrayList<>();
    @Override
    public Product createProduct(String productName, int quantity) {
            Product product1 = new Product();
            String productId = createRandomId();
            product1.setProductId(productId);
            product1.setProductName(productName);
            product1.setQuantity(quantity);
            product1.setCost(quantity*100.00);
            ProductList.add(product1);
        return product1;
    }

    @Override
    public <product> int count(String productId, String productName) {
        int quantity1 = 0;
        for (Product product : ProductList) {
            if (Objects.equals(product.getProductId(), productId)) {
                quantity1 = product.getQuantity();
                ++quantity1;
                product.setQuantity(quantity1);
                break;
            }
        }
        return quantity1;
    }

    @Override
    public String createRandomId() {
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }
}
