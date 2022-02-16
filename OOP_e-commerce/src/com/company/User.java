package com.company;

import java.util.ArrayList;

public class User {

    private String username;
    private String name;
    private String surname;
    private String birthday;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    ArrayList<Product> orderedProducts;
    ArrayList<Product> favoriteProducts;
    ArrayList<CreditCard> creditCards;


    public User(String username, String name, String surname, String birthday, String password, String email, String homeAddress, String workAddress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.orderedProducts = new ArrayList<Product>();
        this.favoriteProducts = new ArrayList<Product>();
        this.creditCards = new ArrayList<CreditCard>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }


    public void addCreditCard(CreditCard c1) {
        this.creditCards.add(c1);
    }


    public void addOrder(Product p){
        this.orderedProducts.add(p);
    }

    public void showOrderedProducts() {
        System.out.println("\n: Ordered Products : ");

        for (int i = 0; i < this.orderedProducts.size(); i++) {
            System.out.println(i + 1 + "-" + getOrderedProducts().get(i).getProductName());
        }

    }


    public void addFavorite(Product p) {
        favoriteProducts.add(p);
    }

    public void showFavoriteProducts() {
        System.out.println("\n: Favorite Products : ");

        for (int i = 0; i < this.favoriteProducts.size(); i++) {
            System.out.println(i + 1 + "-" + getFavoriteProducts().get(i).getProductName());
        }

    }


}
