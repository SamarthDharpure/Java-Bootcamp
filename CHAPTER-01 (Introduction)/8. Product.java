import java.util.Scanner;

class Prod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int Prod = firstNum * secondNum;
        System.out.println("Prod of your numbers is: " + Prod);
    }
}
