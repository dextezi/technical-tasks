import java.util.Scanner;

/**
 * Задача 2: Программа принимает две строки и проверяет их идентичность
 */
public class Task2StringComparison {
    
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("ЗАДАЧА 2: Сравнение двух строк");
        System.out.println("==================================================");
        
        Scanner scanner = new Scanner(System.in);
        
        // Ввод данных от пользователя
        System.out.print("\nВведите первую строку (a): ");
        String a = scanner.nextLine();
        
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("РЕЗУЛЬТАТ СРАВНЕНИЯ:");
        System.out.println("-".repeat(50));
        
        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        System.out.println("\n" + "-".repeat(50));
        System.out.println("Первая строка:  '" + a + "'");
        System.out.println("Вторая строка:  '" + b + "'");
        System.out.println("=".repeat(50));
        
        scanner.close();
    }
}
