package interfaces;

import beans.Product;

public interface InventoryManagementService {
    public Product createProduct(String productName, int quantity);

    public <product> int count(String productId, String productName);
    public String createRandomId();

    }

