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


        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];


        System.out.println("podaj liczbe");
        String tekst = scan.next();
        for(int zmienna :tab)
        {
            System.out.println(zmienna + " ");
        }









    }
}
