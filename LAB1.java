import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RhombusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] distances = new int[6];

        System.out.println("Введите 6 натуральных чисел (расстояния):");
        for (int i = 0; i < 6; i++) {
            distances[i] = scanner.nextInt();
        }

        if (isRhombus(distances)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isRhombus(int[] distances) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого расстояния
        for (int distance : distances) {
            countMap.put(distance, countMap.getOrDefault(distance, 0) + 1);
        }

        // Проверяем условия для ромба
        int sideCount = 0;
        int diagonalCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 4) {
                sideCount++;
            } else if (entry.getValue() == 2) {
                diagonalCount++;
            }
        }

        return sideCount == 1 && diagonalCount == 1; // Одна длина стороны и одна длина диагонали
    }
}
