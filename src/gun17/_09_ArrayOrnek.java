package gun17;

import java.util.Scanner;

public class _09_ArrayOrnek {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Bir Cümle Girin"); // kullanıncın girdiği cümledeki kelime sayısını bulun.
        String str = scan.nextLine();
        String [] cumle = new String[str.length()];
        int kelimeSayısı = 1;

        for (int i = 0; i < cumle.length; i++) {
            cumle[i]=String.valueOf(str.charAt(i));
                if(str.charAt(i)==' ') {
                    kelimeSayısı++;
                }

        }
        for (String harf :cumle){
            System.out.print(harf+" ");
        }
        System.out.println("Kelime Sayısı : "+kelimeSayısı);

    }
}
