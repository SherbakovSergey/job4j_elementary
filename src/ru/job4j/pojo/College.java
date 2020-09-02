package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jack");
        student.setGroup("BK-2");
        student.setDate("01.09.2000");
        System.out.println(student.getName() + " " + student.getGroup() + " " + student.getDate());

    }
}
