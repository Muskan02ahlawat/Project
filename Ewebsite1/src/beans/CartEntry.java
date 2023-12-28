package beans;

public class CartEntry {
    Pair<String, Integer, Double> productInfos;


    public Pair<String, Integer, Double> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(Pair<String, Integer, Double> productInfos) {
        this.productInfos = productInfos;
    }

    public CartEntry(Pair<String, Integer, Double> productInfos) {
        this.productInfos = productInfos;
    }

    public CartEntry() {
    }
}
