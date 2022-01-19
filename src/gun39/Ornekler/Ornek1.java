package gun39.Ornekler;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir string alın.
        bu stringi buildera ekleyin
        .sonra kullanıcıdan ayrı bir kelime alıp hangi indexden itibaren ekleencekğini alın.

         */
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Bir cümle Girin : ");
        String str = scanStr.nextLine();

        System.out.println("Eklemek istediğiniz kelimeyi girin : ");
        String kelime = scanStr.nextLine();

        int indexKelime=0;
        try {
            System.out.println("Cumlenin Hangi indexinden sonra eklemek istiyorsunuz ? ");
            indexKelime = scanInt.nextInt();

        }catch (Exception e) {
            indexKelime=0;
        }



        StringBuilder strBuild= new StringBuilder(str);

        try{
            strBuild.insert(indexKelime,kelime);
        }catch (Exception e){
            System.out.println("IndexHatası .Ekleme Yapılamadı ");
        }
        System.out.println(str);

        /*try{
            System.out.println(strBuild.insert(indexKelime,kelime));
        }catch (StringIndexOutOfBoundsException e){
            if(indexKelime>strBuild.length()-1) {
                System.out.println(strBuild.insert(strBuild.length()-1,kelime));
            }
            if (indexKelime<0){
                System.out.println(strBuild.insert(0,kelime));
            }
        }*/

    }
}
