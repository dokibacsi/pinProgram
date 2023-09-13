package pinbemelegito;

import java.util.Scanner;

public class PinBemelegito {

    static int pinkod_reg, pinkod_be, probalkozas, maxProbalkozas;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.printf("Pinkód regisztrálása: ");
        pinkod_reg = scn.nextInt();
        System.out.println("Pinkód elmentve! ");

        probalkozas = 1;
        maxProbalkozas = 3;
        boolean joPin = pinkod_reg == pinkod_be;
        
        while ((probalkozas <= 3) && !(joPin)) {
            System.out.printf("Kód megadása a belépéshez (%d/%d): ", probalkozas, maxProbalkozas);
            pinkod_be = scn.nextInt();

            joPin = pinkod_reg == pinkod_be;

            if (!joPin) {
                System.out.println("Nem jó, próbáld újra!");
            } else if (joPin) {
                System.out.println("Sikeres bejelentkezés!");
            }

            probalkozas++;
        }

    }

}
