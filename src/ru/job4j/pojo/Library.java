package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book book4 = new Book("Book4", 400);
        Book[] cleanCode = new Book[4];
        cleanCode[0] = book1;
        cleanCode[1] = book2;
        cleanCode[2] = book3;
        cleanCode[3] = book4;
        for (int i = 0; i < cleanCode.length; i++) {
            Book bk = cleanCode[i];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        Book temp = cleanCode[0];
        cleanCode[0] = cleanCode[3];
        cleanCode[3] = temp;
        System.out.println("Clean code");
        for (int i = 0; i < cleanCode.length; i++) {
            Book bk = cleanCode[i];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
    }
}
