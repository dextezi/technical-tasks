/**
 * Задача 3: Программа выводит все чётные числа из заданного массива
 */
public class Task3EvenNumbers {
    
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("ЗАДАЧА 3: Фильтрация чётных чисел из массива");
        System.out.println("==================================================");
        
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("\nИсходный массив: ");
        printArray(numbers);
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("ЧЁТНЫЕ ЧИСЛА:");
        System.out.println("-".repeat(50));
        
        System.out.print("Чётные числа: ");
        System.out.print("[");
        boolean first = true;
        for (int num : numbers) {
            if (num % 2 == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(num);
                first = false;
            }
        }
        System.out.println("]");
        
        System.out.println("\nДетальный список чётных чисел:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("  • " + num);
            }
        }
        
        System.out.println("\n" + "=".repeat(50));
    }
    
    /**
     * Вспомогательный метод для вывода массива
     */
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
