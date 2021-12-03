package gun4;

public class StringMetotlar {
    public static void main(String[] args) {
        String name = "Ahmet";
        char ilk = name.charAt(0);
        char son = name.charAt(4);
        boolean aynıMı = ilk==son;
        String soru = "ilk ve son harf aynı mı ? ";
        System.out.println(soru+aynıMı);

        // == aynımı eşit mi ?
        // != eşit değil mi ?

        String cümle = "Java Öğreniyorum";
        String cumleKisim = cümle.substring(5,16);
        System.out.println(cumleKisim);

        // substring methodunda verilen aralık char methodundan farklı olarak +1 yazılmalıdır.

        String cümle1 = "bugün hava kapali şemsiye almam lazim";

        String cümle2parca =cümle1.substring(18);
        String cümle3parca =cümle1.substring(0,17);
        System.out.println(cümle2parca+","+cümle3parca);

        String schollname = "Dortmund Technic";
        char ikinci = schollname.charAt(1);
        char ucuncu = schollname.charAt(2);
        System.out.println("ikinci harf : "+ikinci +" Üçüncü harf : "+ucuncu);

        int cümleuzunluk = schollname.length();
        System.out.println(cümleuzunluk);

        String name1 = "Ahmet";
        char sonHarf =name1.charAt(name1.length()-1);
        System.out.println("sonHarf = " + sonHarf);





    }
}
