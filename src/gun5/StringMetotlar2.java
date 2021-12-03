package gun5;

import java.net.Socket;

public class StringMetotlar2 {
    public static void main(String[] args) {
        String bir = "Bugün Hava";
        String iki = bir +" cok güzel";
        System.out.println(iki);

        String tamCumle = bir.concat(" cok güzel");
        System.out.println("tamCumle = " + tamCumle);
        System.out.println(tamCumle.indexOf("n"));
        System.out.println(tamCumle.indexOf("gün"));
        System.out.println(tamCumle.indexOf("ç"));
    }
}