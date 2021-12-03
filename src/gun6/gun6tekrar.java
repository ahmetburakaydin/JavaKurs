package gun6;

import java.util.Scanner;

public class gun6tekrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki Kelime girin ");
        String cümle3 =scanner.nextLine();

        int bosluk =cümle3.indexOf(" ");
        String ilkKelime =cümle3.substring(0,bosluk);
        String ikinciKelime =cümle3.substring(bosluk+1);

        String yeniİfade = (ikinciKelime+" "+ilkKelime);

        System.out.println("yeniİfade = " + yeniİfade);
        



    }



        /*
        System.out.println("İki kelimelik bir ifade yazınız : ");

        
        String cümle3 = sc.nextLine();

        System.out.println("cümle = " + cümle3);
        
       int ilkIndex=cümle3.indexOf("");
       
       String ilkKelime =cümle3.substring(0,ilkIndex);
       String ikinciKelime=cümle3.substring(ilkIndex);
       
       String istenenİfade=(ikinciKelime+" "+ilkKelime);

       System.out.println("istenenİfade = " + istenenİfade);

         */
               
       
       
       
       
        /*
        System.out.println("Dikdörtgenin bir kenarını girin : ");
        double bir = sc.nextDouble();

        System.out.println("Dikdörtgenin diğer kenarının girin : ");
        double diger=sc.nextDouble();

        double alan = bir*diger;

        System.out.println("Dikdörtgenin Alanı : "+alan);
        
         */


        

}
