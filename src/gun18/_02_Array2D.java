package gun18;

public class _02_Array2D {
    public static void main(String[] args) {
        int[][]nums = {{25,35},{22,11},{4,6}};
        int[][]nums2 = {{35},{22,11},{4,6,24}}; // düzensiz dizi veya tablo

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j]+" ");

            }
            System.out.println();
        }


    }
}
