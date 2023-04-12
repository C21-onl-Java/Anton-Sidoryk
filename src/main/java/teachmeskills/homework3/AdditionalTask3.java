package teachmeskills.homework3;

public class AdditionalTask3 {
    public static void main(String[] args) {
        calc(2, 5, '*');
        calc(90, 55, '-');
        calc(456, 2, '+');
        calc(100, 4, '/');
    }

    public static void calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);

                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Operation is not supported, please try again");
        }
    }
}
