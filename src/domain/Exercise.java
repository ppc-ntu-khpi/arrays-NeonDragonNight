package domain;

import java.util.HashMap;
import java.util.Map;

public class Exercise {
    public static int Calculate(int[] array){

        // Підрахунок кількості кожного числа
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Пошук числа з максимальною кількістю повторень
        int mostFrequent = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return (int) (mostFrequent);
    }
}
