package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Properties {
    private static void example1() {
        try {
            FileReader reader = new FileReader("src/Properties/admin.properties");
            java.util.Properties properties = new java.util.Properties();
            properties.load(reader);
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example2() {
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.setProperty("username","doanhoangngochau");
            properties.setProperty("password","14012001");
            properties.store(new FileWriter("src/Properties/client.properties"),"");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        example1();
        example2();
    }
}
