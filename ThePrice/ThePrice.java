/*
 * Basic Script
 * Author: Diego Piccini da Todi, contact@diegopiccinidatodi.com
 * April, 2023
 */

import java.util.Scanner;

public class ThePrice {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amount;

        System.out.print("What's the price of this item, please ? ");
        amount = keyboard.nextDouble();
        amount = amount + 148.00;

        System.out.print("Thank you. Please bill me $");
        System.out.print(amount);
        System.out.println(" to my personal bank account.");

        keyboard.close();
    }
}
