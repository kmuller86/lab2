import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        int b= 24;
        System.out.println(b);
        do {
            if (i % 24 == 0 && i !=0) {
                System.out.println( i + " - podzielna przez końcówke indeksu 24" + " = " + i/b);
            }
        } while (--i >= 0);
        System.out.println(" ");


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        //a)
        int[] tabela1 = new int[5];
        tabela1[0]=8;
        tabela1[1]=6;
        tabela1[2]=12;
        tabela1[3]=85;
        tabela1[4]=75;

        System.out.println(Arrays.toString(tabela1));

        int z, x;
        z = 0;
        while (z < tabela1.length)
        {
            x = tabela1[z];
            System.out.println(x + " ");
            ++z;
        }
        System.out.println("NEXT");
        System.out.println( " ");

        //b)

        double[] tabela2 = new double[5];
        tabela2[0]=1.1;
        tabela2[1]=5.1;
        tabela2[2]=3.1;
        tabela2[3]=9.1;
        tabela2[4]=2.1;

        System.out.println(Arrays.toString(tabela2));

        double k, d;
        k = 0;
        while (k < tabela2.length) {
            d = tabela2[(int) k];
            System.out.println(d + " ");
            ++k;
        }
        System.out.println("NEXT");
        System.out.println(" ");

        //c)

        String[] tabela3 = new String[5];

        tabela3[0]="JAJKO";
        tabela3[1]="CYPRIAN";
        tabela3[2]="OKO";
        tabela3[3]="MENEL";
        tabela3[4]="LUPA";

        int c = tabela3.length-1;
        String t;
        while (c >= 0) {
            t = tabela3[c];
            System.out.println(t + " ");
            --c;
        }
        System.out.println("");

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


    }
}
