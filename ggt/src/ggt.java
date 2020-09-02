
import java.util.Scanner;

public class ggt{

    public static void main(String[] args) {
        int ersteZahl = eingabe();
        int zweiteZahl = eingabe();
        int ggT = verarbeitung(ersteZahl, zweiteZahl);
        ausgabe(ggT);
    }



    private static int eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        return scanner.nextInt();
    }

    private static int verarbeitung(int ersteZahl, int zweiteZahl) {
        if (ersteZahl == 0)
            return zweiteZahl;
        while (zweiteZahl != 0) {
            if (ersteZahl > zweiteZahl)
                ersteZahl = ersteZahl - zweiteZahl;
            else
                zweiteZahl = zweiteZahl - ersteZahl;
            }
        return ersteZahl;
        }

        //h =(a > b) ? b:a; ? abkürzung für if, wenn true ist a wenn false is b//



    private static void ausgabe(int ggt) {

        System.out.println("Das größte gemeinsame Teilfache ist " + ggt);
    }

}