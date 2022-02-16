package com.company;

public class Product {

    private String productName;
    private String productColor;
    private String productCategory;
    private int productStock;
    private double productWeightKG;
    private String descriptionOfProduct;

    public Product(String productName, String productColor, String productCategory, int productStock, double productWeight, String descriptionOfProduct) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeightKG = productWeight;
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductWeight() {
        return productWeightKG;
    }

    public void setProductWeight(double productWeight) {
        this.productWeightKG = productWeight;
    }

    public String getDescriptionOfProduct() {
        return descriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public boolean enoughStock(Order o1) {
        if (this.productStock >= o1.getNumberOfPurchase()) {
            return true;
        } else {
            System.out.println("It's not in stock");
            return false;
        }
    }


}
