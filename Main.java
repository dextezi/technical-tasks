import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Сравнение чисел и арифметические операции");
            System.out.println("2. Четные числа");
            System.out.println("3. Сравнение строк");
            System.out.println("0. Выход");
            System.out.print("Выберите программу: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ComparisonArithmetic.run(scanner);
                    break;

                case 2:
                    EvenNumbers.main(new String[]{});
                    break;

                case 3:
                    StringComparison.run(scanner);
                    break;

                case 0:
                    System.out.println("Выход...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}
