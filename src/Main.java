import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int a = 4;
        for (int i = 100; i >= 0; i--)
        {
         /* Tu chyba powinno być if (i % a3 == 0 && i !=0) bo w konsoli wypisuje zle wartości np. "3 / 4 = 0" */
            if (i % 3 == 0 && i !=0) {
                System.out.println( i + " / " + a + " = " + i/a);
            }
        }
        System.out.println("NEXT");
        System.out.println(" ");





        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int n = 5;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Wprowadź liczby: ");
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Lista: ");
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i] + 11);
        }


    }
}
