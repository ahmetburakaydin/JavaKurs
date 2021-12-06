package ahmethoca0412;

import java.util.Scanner;

public class _01_Tekrar {
    public static void main(String[] args) {
        //girilen bir kelimenin polidrom olup olmadigini ekrana yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime girin :");
        String str = scan.nextLine();
        String strRev="";
        /*
        for (int i = str.length()-1; i>=0 ; i--) {
            strRev+=str.charAt(i);
         */
        for (int i=0;i<=str.length()-1;i++) {  // i<str.length()
            strRev+=str.charAt(str.length()-1-i);
        }
          if (str.equals(strRev)){
            System.out.println(str+" bir polidromdur");
        } else {
            System.out.println("Bu sayı polidrom değildir!");
        }


    }


}
