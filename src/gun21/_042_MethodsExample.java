package gun21;

public class _042_MethodsExample {
    public static void main(String[] args) {
        System.out.println(isCorrect("ahmetburak29"));
        System.out.println(isCorrect("Alalade123"));
        System.out.println(isCorrect("paspas123pass"));
    }
    public static boolean isCorrect(String password) {
        return ((password.length() >=8 && password.length()<=12) && !(password.contains("pass"))) ;



    }
}
