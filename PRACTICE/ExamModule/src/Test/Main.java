package Test;
import java.util.Scanner;

import Service.ExamService;

public class Main {
    public static void main(String[] args) {
        ExamService examService = new ExamService();
        Scanner scanner = new Scanner(System.in);

        boolean continueFlag = true;

        while (continueFlag) {
            System.out.println("Which exam would you like to appear in?");
            System.out.println("1. Java");
            System.out.println("2. HTML");
            System.out.print("Enter your choice: ");

            int examChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            examService.conductTest(examChoice);

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.nextLine();

            if (!continueChoice.equalsIgnoreCase("yes")) {
                continueFlag = false;
            }
        }

        System.out.println("Program finished.");
    }
}

