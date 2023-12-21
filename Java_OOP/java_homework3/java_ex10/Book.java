package Java1.Ex10;

import Java1.Ex9.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price){

    }
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[name = " + name + "?" + "Author[name " + name + ", email = " + email + " gender = " + gender + "], " + "price = " + price + ", Qty = " + qty;
    }
}
