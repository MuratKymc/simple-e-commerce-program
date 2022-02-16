package com.company;

public class Order {

    private User orderingUser;
    private Product orderedProduct;
    private CreditCard purchasingCreditCard;
    private int numberOfPurchase;

    public Order(User orderingUser, Product orderedProduct, CreditCard purchasingCreditCard, int numberOfPurchase) {
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.purchasingCreditCard = purchasingCreditCard;
        this.numberOfPurchase = numberOfPurchase;
        purchasing();

    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public CreditCard getPurchasingCreditCard() {
        return purchasingCreditCard;
    }

    public void setPurchasingCreditCard(CreditCard purchasingCreditCard) {
        this.purchasingCreditCard = purchasingCreditCard;
    }

    public int getNumberOfPurchase() {
        return numberOfPurchase;
    }

    public void setNumberOfPurchase(int numberOfPurchase) {
        this.numberOfPurchase = numberOfPurchase;
    }

    public void purchasing() {
        if (this.orderedProduct.enoughStock(this)) {
            this.getOrderingUser().addOrder(this.orderedProduct);
            System.out.println("The order has been successfully completed.");

        } else {
            System.out.println("The order has not been completed");
        }

    }

}
