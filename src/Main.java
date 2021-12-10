
import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        int a;
        Scanner console = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        a = console.nextInt();

        switch (a % 2)
        {
            case 0 :
                System.out.println("Liczba jest PARZYSTA");
                break;
            case 1 :
                System.out.println("Liczba jest NIEPARZYSTA");
                break;
        }
        if(a % 7 == 0){
            System.out.println("Liczba " + a + " jest podzielna przez 7." );
        } else {
            System.out.println("Liczba " + a + " nie dzieli się przez 7.");
        }
        System.out.println("NEXT");
        System.out.println(" ");












        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0 };
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                case 'z':
                    ++tablica[3];
                case 'y':
                    ++tablica[4];

                    break;
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\ny: %d - razy",
                tablica[0], tablica[1], tablica[2], tablica[3],tablica[4]);





    }
}
