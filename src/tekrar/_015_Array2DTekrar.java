package tekrar;

public class _015_Array2DTekrar {
    public static void main(String[] args) {
         /*
        5-5 lik bir tabloyu 0-10 arasi sayilarla doldurup yazdirin.
         */
        int[][] nums =new int[5][5];

        for (int i = 0; i < nums.length; i++) {   // tabloyu oluşturmak içeriğini doldurmak için for döngüsü
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=(int) (Math.random()*10);
            }
        }
        for (int i = 0; i < nums.length; i++) { // oluşturulan tabloyu yazdırmak için for döngüsü
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();

        }
    }
}
