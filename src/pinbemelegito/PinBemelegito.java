package pinbemelegito;

import java.util.Scanner;

public class PinBemelegito {

    static int pinkod_reg, pinkod_be, probalkozas, maxProbalkozas, pinMin, pinMax;
    static boolean joPin, joHossz;
    static int[] szamTomb = new int[10];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //szamTomb feltöltése számokkal és kiiratás másik ciklussal!
        for (int i = 0; i < 10;i++) {
            szamTomb[i] = i-1;
            System.out.print(szamTomb[i]);
        }
        
        System.out.println(szamTomb[4]);
        
        //Pinkód regisztrálása
        System.out.printf("Pinkód regisztrálása: ");
        pinkod_reg = scn.nextInt();
        
        joHossz = pinkod_reg >= pinMin || pinkod_reg <= pinMax;
        
        while(!joHossz){
            System.out.printf("Pinkód regisztrálása: ");
            pinkod_reg = scn.nextInt();
            joHossz = pinkod_reg >= pinMin || pinkod_reg <= pinMax;
        }
        
        System.out.println("Pinkód sikeresen beállítva! ");

        
        //
        probalkozas = 1;
        maxProbalkozas = 3;
        joPin = pinkod_reg == pinkod_be;
        
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
