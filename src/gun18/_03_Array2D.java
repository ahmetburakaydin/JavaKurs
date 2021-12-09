package gun18;

public class _03_Array2D {
    public static void main(String[] args) {
        // 5-5 lik bir tabloyu 0-10 arası sayılarla doldurun

        int[][]nums = new int[5][5];

        for (int i = 0; i < nums.length; i++) {  // tabloyu oluşturmak için
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]= (int) (Math.random()*10);
            }

        }
        for (int i = 0; i < nums.length; i++) {  // console a yazdırmak için
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
