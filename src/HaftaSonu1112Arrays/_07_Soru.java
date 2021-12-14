package HaftaSonu1112Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        //Bir dizinin en büyük ve en küçük öğelerini bulun.
        int[] intArray={ 12,6,25,5,17};
        int enB=Integer.MIN_VALUE;
        int enK=Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]>enB) {
                enB=intArray[i];
            }else if(intArray[i]<enK){
                enK=intArray[i];
            }
        }
        System.out.println("en büyük eleman : "+ enB);
        System.out.println("en küçük eleman :"+ enK);

        }
}
