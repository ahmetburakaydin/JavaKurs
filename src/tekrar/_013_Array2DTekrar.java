package tekrar;

public class _013_Array2DTekrar {
    public static void main(String[] args) {
        int[][] nums = new int[3][2];   // [3] => Satır Sayısı    // [2] => Sutun Sayısı

        //                            1.Sütun (0)        2.Sütun(1)
        // 1.Satır (0.İndis)        nums[0][0] = 25;  nums[0][1] = 34;

        // 2.Satır (1.İndis)        nums[1][0] = 22;  nums[1][1] = 11;

        // 3.Satır (2.indis)        nums[2][0] = 4;   nums[2][1] = 6;

        nums[0][0] = 25;  nums[0][1] = 34;

        nums[1][0] = 22;  nums[1][1] = 11;

        nums[2][0] = 4;   nums[2][1] = 6;


        // nums.length  satır uzunluğunu verir(.tablodaki  satır sayısı )
        // nums[i].length sütun uzunluğunu verir (1 satırdaki sütun sayısını verir.)

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }

    }

}
