package primi_esercizi;

import java.util.Scanner;

public class EsercizioDue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int number) {
        System.out.println(number % 2 == 0);
    }

}
