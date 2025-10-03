import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("rohit", 1);
        map.put("fruit",4);
        map.put("bird",5);
        for(String key : map.keySet()){
        System.out.println("Name : "+key+" : value : "+map.get(key));
        }
    }
}
