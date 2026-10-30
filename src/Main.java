import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите первое число");
        double operand1 = scanner.nextDouble();

        while (true) {
            System.out.println("Введите знак операции: +, -, *, /. Или команду: C - сброс, S - выход");
            char operation = scanner.next().charAt(0);

            if (operation == 's' || operation == 'S') {
                break;
            }

            if (operation == 'c' || operation == 'C') {
                System.out.println("Результат сброшен. Введите первое число");
                operand1 = scanner.nextDouble();
                continue;
            }

            System.out.println("Введите второе число");
            double operand2 = scanner.nextDouble();

            double result = 0;
            boolean hasError = false;

            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Ошибка. Делить на ноль нельзя!");
                        hasError = true;
                        break;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Операция не поддерживается");
                    hasError = true;
            }

            if (!hasError) {
                operand1 = result;
                System.out.println("Ваш результат равен: " + result);
            }
        }

        System.out.println("Калькулятор выключен");
        scanner.close();
    }
}