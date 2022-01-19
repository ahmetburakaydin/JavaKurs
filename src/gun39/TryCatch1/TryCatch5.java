package gun39.TryCatch1;

public class TryCatch5 {
    public static void main(String[] args) {
        /*System.out.println(1);*/
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            bekle(3000);
        }
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*System.out.println(2);*/


    }
    public static void bekle(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
