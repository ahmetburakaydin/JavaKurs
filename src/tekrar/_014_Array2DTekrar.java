package tekrar;

public class _014_Array2DTekrar {
    public static void main(String[] args) {
        int[][] nums = {{25,34},{22,11},{4,6}}; // bi önceki classtaki ile ayni

        int[][] nums2 = {{2},{23,45},{34,22,56}}; // düzensiz dizi ve ya tablo

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j]+" ");

            }
            System.out.println();
        }

    }
}
