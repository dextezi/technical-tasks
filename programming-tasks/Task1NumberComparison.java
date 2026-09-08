import java.util.Scanner;

/**
 * Задача 1: Программа принимает два целых числа и:
 * - сравнивает их
 * - выполняет операции сложения, вычитания, умножения и деления
 */
public class Task1NumberComparison {
    
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("ЗАДАЧА 1: Сравнение чисел и арифметические операции");
        System.out.println("==================================================");
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Ввод данных от пользователя
            System.out.print("\nВведите первое целое число (a): ");
            int a = scanner.nextInt();
            
            System.out.print("Введите второе целое число (b): ");
            int b = scanner.nextInt();
            
            System.out.println("\n" + "-".repeat(50));
            System.out.println("РЕЗУЛЬТАТЫ СРАВНЕНИЯ:");
            System.out.println("-".repeat(50));
            
            // Сравнение чисел
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            
            System.out.println("\n" + "-".repeat(50));
            System.out.println("РЕЗУЛЬТАТЫ АРИФМЕТИЧЕСКИХ ОПЕРАЦИЙ:");
            System.out.println("-".repeat(50));
            
            // Арифметические операции
            System.out.println("Сложение:      " + a + " + " + b + " = " + (a + b));
            System.out.println("Вычитание:     " + a + " - " + b + " = " + (a - b));
            System.out.println("Умножение:     " + a + " × " + b + " = " + (a * b));
            
            // Деление с проверкой на ноль
            if (b != 0) {
                double division = (double) a / b;
                System.out.printf("Деление:       %d ÷ %d = %.2f%n", a, b, division);
            } else {
                System.out.println("Деление:       Ошибка! Деление на ноль невозможно");
            }
            
            System.out.println("\n" + "=".repeat(50));
            
        } catch (Exception e) {
            System.out.println("Ошибка: Пожалуйста, введите целые числа!");
        } finally {
            scanner.close();
        }
    }
}
