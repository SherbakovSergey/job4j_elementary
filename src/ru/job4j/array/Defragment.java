package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        int notNullIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
            }
            if (array[index] != null) {
                notNullIndex = index;
                if (point < notNullIndex) {
                    String temp = array[point];
                    array[point] = array[notNullIndex];
                    array[notNullIndex] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
