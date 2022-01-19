package gun39.StringBuilderBuffer;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("Java Dunyası");
        System.out.println(strBuilder);

        strBuilder.append(12);

        strBuilder.insert(3,"XX");


        strBuilder.insert(5,12);
        System.out.println(strBuilder);
    }
}
