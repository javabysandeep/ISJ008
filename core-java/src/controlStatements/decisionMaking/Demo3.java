package controlStatements.decisionMaking;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("its even number.. " + number);
        }
        if (number % 2 != 0) {
            System.out.println("its an odd number.. " + number);
        }
    }
}
