package com.company;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Ali123", "Ali", "Veli", "01.01.2001", "1234", "aliveli@gmail.com", "Istanbul", "Istanbul");
        User u2 = new User("MrtKymc", "Murat", "Kuyumcu", "01.01.2001", "1234", "mkuyumcu99@gmail.com", "Rize", "Rize");

        CreditCard c1 = new CreditCard(u1, "123456", "9999", "01.04.2030");
        u1.addCreditCard(c1);
        CreditCard c2 = new CreditCard(u2, "456123", "1234", "01.04.2029");
        u2.addCreditCard(c2);

        Product p1 = new Product("Ereaser", "White", "Stationery", 10, 0.2, "Eraser for white papers");
        Product p2 = new Product("Pencil", "Black", "Stationery", 10, 0.5, "Blue ink pencil");


        Order o1 = new Order(u1, p1, c2, 5);
        Order o2 = new Order(u1, p2, c1, 12);

        u1.showOrderedProducts();

        u1.addFavorite(p1);
        u1.addFavorite(p2);

        u1.showFavoriteProducts();

    }
}
