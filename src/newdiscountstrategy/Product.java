package newdiscountstrategy;

public class Product {

    private String prodID;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;
    public static final String ERROR_PRODUCT_ID = "Product must have an ID number";

    public Product(String prodID, String prodName, double unitCost, DiscountStrategy discount) {

        this.prodID = prodID;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }

    public final double getDiscount(int qty) {

        return discount.getDiscount(unitCost, qty);
    }

    public final String getProdID() {
        if(prodID == null){
            System.out.println(ERROR_PRODUCT_ID);
        }
        return prodID;
    }

    public final void setProdID(String prodID) {

        this.prodID = prodID;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {

        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {

        this.unitCost = unitCost;
    }

}
