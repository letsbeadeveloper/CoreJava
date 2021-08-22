import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10");


        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
        
        System.out.println("Enter your name");
        String test = scanner.next();
        
        System.out.println(test);
    }
}