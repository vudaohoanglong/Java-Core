package lang;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        stringBuilder.append((char) 65);
        stringBuilder.append((char) 66);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
