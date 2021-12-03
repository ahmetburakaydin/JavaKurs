package gun7;

public class _02StringMetotlar {
    public static void main(String[] args) {
        String str = "Java Alistirmalari6";
        String str2 = "";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("j"));

        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("A"));

        String strReplace =str.replace('a','s');
        String strReplace2 = str.replace(str,"Python");

        System.out.println(strReplace);
        System.out.println(strReplace2);

        System.out.println(str.replaceFirst("a","e"));

        String strReplaceAll=str.replaceAll("[a-z]","*");
        System.out.println(strReplaceAll);

        String strReplaceAll2 =str.replaceAll("[^a-z]","*");
        System.out.println(strReplaceAll2);


    }
}
