package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Clean code", 300);
        Book book4 = new Book("Book4", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.equals("Clean code")) {
                System.out.println(bk.getName() + " " + bk.getPage());
                break;
            }
        }
    }
}
