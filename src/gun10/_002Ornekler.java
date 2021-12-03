package gun10;

import java.util.Scanner;

public class _002Ornekler {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dersin adının ve aldığınız notu yazın ( 'Ders : not' şeklinde ) ");
        String dersNot =scan1.nextLine();

        int bosluk = dersNot.indexOf(" ");
        String sayıNot=dersNot.substring(bosluk+1);

        int intNot =Integer.parseInt(sayıNot);

        if (intNot >=90){
            System.out.println(" Ders Notunuz : A");
        }
        else if ( intNot >=80) {
            System.out.println("Ders Notunuz : B ");
        }
        else if ( intNot>=70 ) {
            System.out.println("Ders Notunuz : C ");
        }
        else if ( intNot>=60) {
            System.out.println("Ders Notunuz : D ");
        }
        else if ( intNot>=50) {
            System.out.println("Ders Notunuz : E ");
        }
        else {
            System.out.println("Ders Notunuz : F");
        }






    }
}
