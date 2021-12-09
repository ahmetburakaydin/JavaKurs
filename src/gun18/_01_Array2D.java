package gun18;

public class _01_Array2D {
    public static void main(String[] args) {
        int[][] nums =new int[3][2]; // 1. satır sayısı
                                     // 2. sutun sayısı

        nums[0][0] = 25;
        nums[0][1] = 34;

        nums[1][0] = 22;
        nums[1][1] = 11;

        nums[2][0] = 4;
        nums[2][1] = 6;

        // nums.length  satır uzunluğunu verir(.tablodaki  satır sayısı )
        // nums[i].length sütun uzunluğunu verir (1 satırdaki sütun sayısını verir.

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
                
            }

        }
        System.out.println();

    }
}
