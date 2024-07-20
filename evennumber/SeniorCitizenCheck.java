package evennumber;

import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        if (isSeniorCitizen(age)) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }

        scanner.close();
    }

    public static boolean isSeniorCitizen(int age) {
        return age >= 60;
    }
}
