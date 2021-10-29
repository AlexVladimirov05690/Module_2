import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("*** CITIZEN ***");
        System.out.println("Калькулятор запущен. Введите число");
        double operand1, operand2;
        int i = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                operand1 = scanner.nextDouble();
            } else {
                System.out.println("Введённое значение не является числом!!! Перезапустите программу!");
                break;
            }
            char operation = scanner.next().charAt(0);
            if (scanner.hasNextDouble()) {
                operand2 = scanner.nextDouble();
            } else {
                System.out.println("Введённое значение не является числом!!! Перезапустите программу!");
                break;
            }

            System.out.println(action(operand1, operation, operand2));
        }
        while (i == 1);
    }

    private static double action(double a, char b, double c) {
        double result = 0;
        switch (b) {
            case '+':
                result = a + c;
                break;
            case '-':
                result = a - c;
                break;
            case '/':
                result = a / c;
                break;
            case '*':
                result = a * c;
                break;
            default:
                System.out.println("Неправильно введено действие");
                break;
        }
        return result;
    }
}

