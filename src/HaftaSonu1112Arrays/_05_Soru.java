package HaftaSonu1112Arrays;

public class _05_Soru {
    public static void main(String[] args) {
        //Bir dizinin tüm elemanlarının toplamını ve çarpımını bulan bir program yazın

        int[] nums= {2,3,5,10,25};
        int toplam=0;
        int carpim=1;

        for (int i = 0; i < nums.length; i++) {
            toplam+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
             carpim*=nums[i];
        }
        System.out.println("Elemanların toplamı : "+ toplam);
        System.out.println("Elemanların çarpımı : "+ carpim);
    }
}
