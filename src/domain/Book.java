package domain;

public class Book {
    private String name;
    private String author;
    private double price;
    private int inventory;

    public Book(String name, String author, double price, int inventory) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.inventory = inventory;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
