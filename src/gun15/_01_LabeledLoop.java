package gun15;

public class _01_LabeledLoop {
    public static void main(String[] args) {
        // break sadece içinde bulunduğu döngüyü kırar.( continue içinde geçerlidir.)

        disDöngü : for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j==3){
                    System.out.println(i+"*"+j+"="+(i*j));
                    break disDöngü;
                }

            }
            
        }
    }
}    