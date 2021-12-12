import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

            List<String> zwierzeta = new ArrayList<>();
            Scanner scan = new Scanner((System.in));
            System.out.print("Wpisz  zwierzęta : ");

            for (int i = 0; i < 5; i++)
            {
                zwierzeta.add(scan.nextLine());
            }
            System.out.println("zwierzeta: " + zwierzeta);


            for (String zmienna : zwierzeta)
            {
                System.out.print(zmienna + " , ");
            }
            System.out.println(" ");

            int p = 0;
            while (p < Math.min(zwierzeta.size(), 2))
            {
                zwierzeta.remove(zwierzeta.size() - 1);
                p++;
            }

            zwierzeta.add("Koń");
            zwierzeta.add("Pies");
            zwierzeta.add("Lama");

            System.out.println("Zmodyfikowane : " + zwierzeta);
            System.out.println("Wielkość listy: " + zwierzeta.size());

            System.out.println("zwierzeta od tyłu:");
            for (int a = zwierzeta.size() - 1; a >= 0; a--)
            {
                System.out.print(zwierzeta.get(a) + " , ");
            }

            System.out.println(" ");
            System.out.println("zwierzeta od tyłu : " + zwierzeta);





         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        SortedSet<Integer> liczba = new TreeSet<>();
        Scanner scan1 = new Scanner((System.in));
        System.out.print("Wypisz kilka liczb max 10 : ");

        for (int i = 0; i < 10; i++)
        {
            liczba.add(Integer.valueOf(scan.nextLine()));


        }
       // Collections.sort(liczba);
        // nie wiem czemu ale nie dziala mi w taki sposob posortowanie jak w przykladzie :/
        //zastosowałem SortedSet

        System.out.println("Twoje Liczby to: " + liczba );


    }

}
