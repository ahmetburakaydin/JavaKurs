package gun39.Ornekler;

import java.util.Scanner;

public class Ornek1Cozum3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle alin
        bu cümleyi StringBuilder"a ekleyin
        sonra kullanicidan ayri bir kelime ve hangi indexden itibaren ekleneceini alin
        bu kelimeyi istenilen indexden itibaren ekleyin ve ekrana yazin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Cumle Girin : ");
        String cumle = scan.nextLine();
        StringBuilder str = new StringBuilder(cumle);

        System.out.println("Eklemek istediğiniz Kelimeyi yazın");
        String kelime = scan.nextLine();

        boolean islem = false;
        int index=0;
        while(!islem){
            try{
                System.out.println("Eklemek Istediğiniz Index Numarasını Girin :");
                index = scan.nextInt();
                islem=true;
            }catch (Exception e){
                System.out.println("Integer Girmelisiniz");

            }
            scan.nextLine();
        }
        try {
            str.insert(index,kelime);
        }catch (Exception e) {
            System.out.println("IndexHatası.EklemeYapılamadı");
        }
        System.out.println(str);



    }
}
