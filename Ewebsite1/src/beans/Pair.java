package beans;

public class Pair<F, S, T> {
    private F ProductId;
    private S Quantity;

    private T Cost;

    public F getProductId() {
        return ProductId;
    }

    public void setProductId(F productId) {
        ProductId = productId;
    }

    public S getQuantity() {
        return Quantity;
    }

    public void setQuantity(S quantity) {
        Quantity = quantity;
    }

    public T getCost() {
        return Cost;
    }

    public void setCost(T cost) {
        Cost = cost;
    }

    public Pair(F productId, S quantity, T cost) {
        ProductId = productId;
        Quantity = quantity;
        Cost = cost;
    }

    public Pair() {
    }
}