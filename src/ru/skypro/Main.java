package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    task1();
        task2();
        task3();
        task4();
    }

    /**
     * Объявите три массива:
     *  1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
     *  2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
     *  3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
     *          с помощью ключевого слова или сразу заполненный элементами.
     */
    private static void task1() {
        int [] firstArray = new int [] {1, 2, 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] thirdArray = {23, 112, 9998, 1, 0, 90};
    }

    /**
     * Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
     *      через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
     */
    private static void task2() {
        System.out.println("Task2:");
        int [] firstArray = new int [] {1, 2, 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] thirdArray = {23, 112, 9998, 1, 0, 90};

        System.out.print("Массив 1: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i != (firstArray.length - 1)) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("Массив 2: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i != (secondArray.length - 1)) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();


        System.out.print("Массив 3: ");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i != (thirdArray.length - 1)) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
     *      а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются
     *      на одной строчке, а элементы другого массива – на другой.
     * Запятая между последним элементом одного массива и первым элементом следующего не нужна.
     * Если во втором задании в консоль у вас вывелся результат
     *      1, 2, 3
     *      1.57, 7.654, 9.986
     *      *произвольные элементы третьего массива*
     * То в третьем задании результат должен быть
     *      3, 2, 1
     *      9.986, 7.654, 1.57
     *      *произвольные элементы третьего массива в обратном порядке*
     */
    private static void task3() {
        System.out.println("Task3:");
        int [] firstArray = new int [] {1, 2, 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] thirdArray = {23, 112, 9998, 1, 0, 90};

        System.out.print("Массив 1: ");
        int lastElement = firstArray.length - 1;
        for (int i = lastElement; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("Массив 2: ");
        lastElement = secondArray.length - 1;
        for (int i = lastElement; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("Массив 3: ");
        lastElement = thirdArray.length - 1;
        for (int i = lastElement; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
     * Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
     * Распечатайте результат преобразования в консоль.
     */
    private static void task4() {
        System.out.println("Task4:");
        int [] firstArray = new int [] {1, 2, 3};
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }

}
