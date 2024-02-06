import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int result = scanner.nextInt();;

        while (true) {
            System.out.print("Введите операцию '+', '-', '*', '/', 'C' для сброса, 's' для выхода: ");
            char operation = scanner.next().charAt(0);

            if (operation == 's') {
                break;
            }

            if (operation != 'C') {
                System.out.print("Введите второе число: ");
                int operand2 = scanner.nextInt();

                switch (operation) {
                    case '+':
                        result += operand2;
                        break;
                    case '-':
                        result -= operand2;
                        break;
                    case '*':
                        result *= operand2;
                        break;
                    case '/':
                        if (operand2 != 0) {
                            result /= operand2;
                        } else {
                            System.out.println("Ошибка: деление на ноль!");

                        }
                        break;
                    default:
                        System.out.println("Некорректная операция");
                        return;
                }

                System.out.println("Результат: " + result);
            } else {
                System.out.println("Результат сброшен.");
                System.out.print("Введите первое число: ");
                result = scanner.nextInt();;
            }
        }
    }
}