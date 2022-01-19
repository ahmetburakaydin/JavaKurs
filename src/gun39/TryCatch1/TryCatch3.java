package gun39.TryCatch1;

import gun39.StringBuilderBuffer.StringBufferEx;

public class TryCatch3 {
    public static void main(String[] args) {
        String str="Java";



        try{
            System.out.println(str.charAt(100));
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(str.charAt(str.length()-1));
        }

        try{
            System.out.println(str.charAt(100));
        }catch (Exception e) {
            System.out.println(str.charAt(str.length()-1));
        }

        try{
            System.out.println(str.charAt(100));
        }catch (Exception e) {
            System.out.println(str.charAt(str.length()-1));
        }



        try{
            System.out.println(str.charAt(100));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(str.charAt(str.length()-1));
        }
    }
}
