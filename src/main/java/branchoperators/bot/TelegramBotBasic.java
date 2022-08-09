package branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Базовые элементы бота
 */
public class TelegramBotBasic {
    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Vvedite chislo:");
            int number = 0;
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Enter number please.. only number =). And not big.");
                bufferedReader.close();
                break;
            }
            if (number == 1) {
                System.out.println("Hello");
            } else if (number == 2) {
                System.out.println("Buy");
            } else if (number ==3) {
                System.out.println(" What???");
            } else {
                System.out.println("I don't understand you, I'm turnung off");
                bufferedReader.close();
                break;
            }
        }
    }
}