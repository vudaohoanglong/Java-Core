package Map;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,String> hashMap = new java.util.HashMap<>();
        hashMap.put("1","Hi");
        hashMap.put("2","Hello");
        for (Map.Entry s : hashMap.entrySet()) {
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}