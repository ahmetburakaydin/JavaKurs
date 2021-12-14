package haftasonu1112Methods;

public class _02_Soru {
    public static void main(String[] args) {
        //Verilen bir sayının çift mi yoksa tek mi olduğunu bulan bir program tanımlayın
        tekCift(8);
    }
    public static void tekCift (int a) {
        if(a%2==0){
            System.out.println("Sayı Çifttir.");
        }else{
            System.out.println("Sayı Tekdir");
        }
    }
}
