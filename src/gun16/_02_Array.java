package gun16;

public class _02_Array {
    public static void main(String[] args) {
        String[] strArray = new String[6];
        String[] array ={"hello","merhaba","hallo"};
        strArray [0] = "A";
        strArray [1] = "B";
        strArray [2] = " ";

        strArray [5] = "C";

        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(strArray[i]);
        }
    }
}
