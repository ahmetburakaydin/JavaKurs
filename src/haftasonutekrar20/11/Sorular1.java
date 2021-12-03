package haftasonutekrar2011;

public class Sorular1 {
    public static void main(String[] args) {

        String myStr = "Bir ben vardır bende. benden içeri.";
        System.out.println(myStr.length());

        int indexFirst = 0;
        char charFirst = myStr.charAt(indexFirst);
        System.out.println("charFirst = "+charFirst+" ,"+ indexFirst);

        int indexMid = (myStr.length())/2;
        char charMid = myStr.charAt(indexMid);
        System.out.println("charMid = "+charMid+" ,"+ indexMid);

        int indexLast = myStr.length()-1;
        char charLast = myStr.charAt(indexLast);
        System.out.println("charLast = "+charLast+" ,"+ indexLast);


        System.out.println("Indexlerin Toplamı = "+(indexFirst+indexMid+indexLast));




    }
}
