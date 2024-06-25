import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел от пользователя
        System.out.print("Введите первое число: ");
        String num1 = scanner.nextLine();

        System.out.print("Введите второе число: ");
        String num2 = scanner.nextLine();

        // Вызываем функцию для сложения чисел
        String sumResult = addStrings(num1, num2);

        // Выводим результат
        System.out.println("Сумма чисел: " + sumResult);

        scanner.close();
    }

    public static String addStrings(String num1, String num2) {
        // Преобразуем строки в целые числа
        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);

        // Складываем числа
        int sum = int1 + int2;

        // Преобразуем результат обратно в строку
        String sumString = Integer.toString(sum);

        // Возвращаем результат
        return sumString;
    }
}
