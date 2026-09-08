// Главный класс для запуска всех задач
import java.util.Scanner;

/**
 * Главная программа для запуска всех трёх задач
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("РЕШЕНИЕ ПРОГРАММНЫХ ЗАДАЧ НА JAVA");
            System.out.println("=".repeat(50));
            System.out.println("\nВыберите задачу для запуска:");
            System.out.println("1. Задача 1 - Сравнение чисел и арифметические операции");
            System.out.println("2. Задача 2 - Сравнение двух строк");
            System.out.println("3. Задача 3 - Фильтрация чётных чисел");
            System.out.println("0. Выход");
            System.out.print("\nВведите номер задачи: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
                
                System.out.println("\n");
                
                switch (choice) {
                    case 1:
                        Task1NumberComparison.main(new String[]{});
                        break;
                    case 2:
                        Task2StringComparison.main(new String[]{});
                        break;
                    case 3:
                        Task3EvenNumbers.main(new String[]{});
                        break;
                    case 0:
                        System.out.println("Спасибо за использование программы! До свидания!");
                        running = false;
                        break;
                    default:
                        System.out.println("Ошибка: Пожалуйста, выберите номер от 0 до 3");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: Пожалуйста, введите корректный номер");
                scanner.nextLine(); // Очистка буфера при ошибке
            }
        }
        
        scanner.close();
    }
}
