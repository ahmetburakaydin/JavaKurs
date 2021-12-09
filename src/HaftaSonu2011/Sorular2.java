package HaftaSonu2011;

public class Sorular2 {
    public static void main(String[] args) {
        /*
        Tanımlanan bir String içerisinde geçen ve değişken olarak verilen bir
        karakterin ilk bulunduğu yer ile son bulunduğu yer
        arasındaki substringin uzunluğunu bulunuz
         */
        String str1 = "Java Buralarda mı";
        String ch = "r";

        int ilkYer = str1.indexOf(ch);
        int sonYer = str1.lastIndexOf(ch);

        String arasındakiYer=str1.substring((ilkYer+1),sonYer);

        System.out.println("araYer = " + arasındakiYer+", Uzunluk = "+arasındakiYer.length());
    }
}
