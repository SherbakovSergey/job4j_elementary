package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number / 1 == number && number % 2 != 0 || number == 2) {
                    prime = true;
                    break;
                } else {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
