package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        System.out.println(dic.engToRus("Hello"));
    }

    public String engToRus(String eng) {
        String result = "Неизвестное слово. " + eng;
        return result;
    }
}
