import java.util.HashMap;

public class youtest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Amit");
        map.put(2, "Rohit");
        map.put(3, "Sita");

        System.out.println(map.get(3));

        for (Integer key : map.keySet()) {
            System.out.println("Roll " + key + " → " + map.get(key));
        }
    }
}
