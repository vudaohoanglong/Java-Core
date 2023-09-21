package Exception;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class UnsupportedEncodingExecption {
    public static void main(String[] args) {
        String name = "Hello";
        try {
            name.getBytes("UTF");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
