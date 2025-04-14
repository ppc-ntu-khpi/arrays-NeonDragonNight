package test;

import java.util.Random;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        // Генерація масиву з випадкових чисел від 0 до 9
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        // Вивід масиву
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Повторюється найбільшу кількість разів число: " + Exercise.Calculate(array));
    }
}
