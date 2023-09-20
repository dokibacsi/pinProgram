package pinbemelegito;

import java.util.Scanner;

public class Registration {

    private int pinReg;
    private int pinMin = 4, pinMax = 6;
    private boolean joHossz;
    Registration reg = new Registration();
    Scanner scn = new Scanner(System.in);

    private void indit() {
        reg.bekeres();
        reg.ellenorzes();
    }

    private int bekeres() {
        System.out.printf("Pinkód regisztrálása: ");
        pinReg = scn.nextInt();
        return pinReg;
    }

    private void ellenorzes() {
        joHossz = pinReg >= pinMin || pinReg <= pinMax;

        while (!joHossz) {
            System.out.printf("Ejho! A határértékeken belül tartózkodjunk! Próbáld újra!\n"
                    + "Pinkód regisztrálása: ");
            pinReg = scn.nextInt();
            joHossz = pinReg >= pinMin || pinReg <= pinMax;
        }

        System.out.println("Pinkód sikeresen beállítva! ");
    }

    public int getPinReg() {
        return pinReg;
    }
}
