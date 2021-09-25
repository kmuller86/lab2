public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for(int i = 0 ;i <=50;i++)
        {
            if(i <0)
                break;
            System.out.println("break" + i);

        }
        for(int x = 5;x<2;x++)
        {
            if(x >=50)
                continue;
            System.out.println("continue" +x );
        }
        for (int z = 30;z>50;--z)
        {
            if(z==55)
                return;
            System.out.println("reurn" + z);
        }


    }
}
