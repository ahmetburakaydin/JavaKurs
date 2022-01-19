package gun39.StringBuilderBuffer;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();

        strBuff.append(15);
        strBuff.append("ABA");
        strBuff.insert(2,"asya");
        System.out.println(strBuff);
    }

}
