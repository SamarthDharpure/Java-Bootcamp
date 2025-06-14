import java.util.Scanner;

class Div {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int div = firstNum - secondNum;
        System.out.println("Div of your numbers is: " + div);
    }
}
