package HaftaSonu0412;

public class _20_Soru {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num ; i++) {
            int s = i+1;
            for (int j =0; j<=num-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j =0; j<=2*i;  j++) {
                System.out.print(s);
                if (j >= i)
                    s++;
                else
                    s--;
            }
            System.out.println();
        }



    }
}
