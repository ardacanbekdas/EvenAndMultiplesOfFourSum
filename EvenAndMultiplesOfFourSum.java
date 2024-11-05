package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class EvenAndMultiplesOfFourSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        do {
            System.out.print("Please enter a number: ");
            number = input.nextInt();
            if (number % 4 == 0){
                total += number;
            }

        }while (number % 2 == 0);
        System.out.println("The sum of the entered numbers that are multiples of 4. = " + total);

    }
}
//Java program that accepts input from the user using loops until a single number is entered, and adds the numbers that are multiples of 4 from the entered values and prints them on the screen.