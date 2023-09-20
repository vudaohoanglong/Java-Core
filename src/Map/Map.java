package Map;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String> hashMap = new java.util.HashMap<>();
        System.out.println(hashMap.put(1,"Hello"));
        System.out.println(hashMap.put(1,"New"));
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(1));
        hashMap.put(2,"Bye");
        System.out.println(hashMap.get(2));
        for (java.util.Map.Entry s : hashMap.entrySet()) {
            System.out.println(s.getKey()+ " say "+s.getValue());
        }
    }
}
