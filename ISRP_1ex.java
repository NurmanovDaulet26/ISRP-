import java.util.Objects;
import java.util.Scanner;

public class ISRP_1ex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeater = "";
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        char operation = 0;
        while(!Objects.equals(repeater, "no")){
            num1 = getNum1(num1);
            num2 = getNum2(num2);
            operation = getOperation(operation);
            Calc(num1, num2, sum, operation);
            System.out.println("Continue? \nFor exit enter 'no'");
            repeater =  scanner.nextLine();
        }
        scanner.close();
    }

    public static int getNum1(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num = scanner.nextInt();
        return num;
    }
    public static int getNum2(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 2: ");
        num = scanner.nextInt();
        return num;
    }
    public static char getOperation(char operation){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of operation: ");
        operation = scanner.next().charAt(0);
        return operation;
    }
    public static void Calc(int num1, int num2, int sum, char operation){
        switch (operation) {
            case '+' -> {
                sum = Folding(num1, num2);
                System.out.println("Result: " + sum);
            }
            case '-' -> {
                sum = Subtractrion(num1, num2);
                System.out.println("Result: " + sum);
            }
            case '*' -> {
                sum = Multiplication(num1, num2);
                System.out.println("Result: " + sum);
            }
            case '/' -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("ERROR: Division by zero");
                } else {
                    sum = Division(num1, num2);
                    System.out.println(STR."Result: \{sum}");
                }
            }
            default -> {
            }
        }

    }
    public static int Folding(int num1, int num2){
        num1 += num2;
        return num1;
    }
    public static int Subtractrion(int num1, int num2){
        num1 -= num2;
        return num1;
    }
    public static int Division(int num1, int num2){
        num1 /= num2;
        return num1;
    }
    public static int Multiplication(int num1, int num2){
        num1 *= num2;
        return num1;
    }
}