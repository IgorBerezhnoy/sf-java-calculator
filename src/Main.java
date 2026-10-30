import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите первое число");
        double operand1 = scanner.nextDouble();

        System.out.println("Введите знак операции: +, -, *, /.");
        char operation = scanner.next().charAt(0);

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
            System.out.println("Ваш результат равен: " + result);
        }

    }
}