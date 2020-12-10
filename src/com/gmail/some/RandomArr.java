package com.gmail.some;
import java.util.Arrays;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
и выведете это количество на экран на отдельной строке.
 */

public class RandomArr {
    public static void main(String[] args) {
        int [] a = new int [15];
        int summ =0;

        for (int i=0;i<a.length;i++) {
            double q = Math.random()*10;
            int q1 = (int)q;
            a[i] = q1;

            if (a[i]%2==0) {
                summ++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(summ+" кол-во чётных чисел");
    }
}


