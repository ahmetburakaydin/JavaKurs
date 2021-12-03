package gun14;

public class _01_ForLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println("i = " + i);
            i++;
        }
        for(i =0;i<10;i++) {
            System.out.println("i = " + i);
        }
        for (i=10;i>0;i--) {
            System.out.println("i = " + i);

        }
        /*
        while döngüsü başlangıc bitiş değeri belli olmayan  döngü için kullanılır.
        for döngüsü ise  başlangıcı ve bitiş noktası belli olan durumlar için kullanılır.
         */
    }
}
