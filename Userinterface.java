import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private Calculator calculator = new Calculator();

    // Handle Addition
    public void performAddition() {
        System.out.println("Choose Addition Type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int a1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = scanner.nextInt();
                System.out.println("Result: " + calculator.add(a1, b1));
                break;

            case 2:
                System.out.print("Enter first double: ");
                double d1 = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double d2 = scanner.nextDouble();
                System.out.println("Result: " + calculator.add(d1, d2));
                break;

            case 3:
                System.out.print("Enter first integer: ");
                int t1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int t2 = scanner.nextInt();
                System.out.print("Enter third integer: ");
                int t3 = scanner.nextInt();
                System.out.println("Result: " + calculator.add(t1, t2, t3));
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    // Handle Subtraction
    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.subtract(a, b));
    }

    // Handle Multiplication
    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
    }

    // Handle Division
    public void performDivision() {
        try {
            System.out.print("Enter numerator: ");
            int a = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int b = scanner.nextInt();
            System.out.println("Result: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // Main Menu
    public void mainMenu() {
        while (true) {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
