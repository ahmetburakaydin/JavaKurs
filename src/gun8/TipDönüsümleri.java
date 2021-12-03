package gun8;

public class TipDönüsümleri {
    public static void main(String[] args) {
        String str = "1234";
        int intDeger = Integer.parseInt(str);
        System.out.println(intDeger);
        double doubleDeger = Double.parseDouble(str);
        System.out.println(doubleDeger);

        double doubleDegisken = 12;
        int intDegisken = (int) doubleDegisken;
        float f = (float) doubleDegisken;

        int i = 1234;
        String strInt =String.valueOf(i);
        System.out.println(strInt);

        double d = 12345;
        String strDouble =String.valueOf(d);
        System.out.println(strDouble);

    }
}
