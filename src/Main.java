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
        Scanner scan = new Scanner(System.in);
        System.out.println(" Podaj liczbe =");

        switch (scan.nextInt())
        {
            case 1:
            {
                if(scan.nextInt() %2==0 ^ scan.nextInt() /1 ==0)
                System.out.println(" liczba parzysta " + scan.nextInt()) ;
            }
            case 2:
            { if(scan.nextInt() %7 ==0)
                System.out.println( " liczba poczleilna przez 7" + scan.nextInt() );
            }

        }












        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */



    }
}
