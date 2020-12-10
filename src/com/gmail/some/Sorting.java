package com.gmail.some;
import java.util.Arrays;

/*
Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
*/

public class Sorting {
    public static void main(String[] args) {

        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            double q = Math.random() * 10;
            int q1 = (int) q;
            a[i] = q1;
        }
        System.out.println(Arrays.toString(a)+" рандомный массив");
        sort(a);
    }

    public static void sort(int [] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a)+" соритровка от меньшего к большему");
    }
}

