package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double remainingDebt = amount * percent + amount - salary;
        while (remainingDebt > 0) {
            year += 1;
            remainingDebt = remainingDebt * percent + remainingDebt - salary;
        }
        return year;
    }
}
