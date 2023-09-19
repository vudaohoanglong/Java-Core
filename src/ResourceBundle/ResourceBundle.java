package ResourceBundle;

import java.util.Locale;

public class ResourceBundle {
    private static void example() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("greeting",new Locale("vi","VN"));
        System.out.println(bundle.getString("greeting"));
    }
    public static void main(String[] args) {
        example();
    }
}
