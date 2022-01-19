package gun39.Ornekler;

import java.util.Scanner;

public class Ornek1Cozum2 {
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

        System.out.println("Kacıncı Indexe Eklemek Istiyorsunuz");
        int index = 0;
        try{
            index = scan.nextInt();
        }catch (Exception e){
            index=0;
        }
        try {
            str.insert(index,kelime);
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("IndexHatası,EklemeYapılmadı!");
        }
        System.out.println(str);


    }
}
