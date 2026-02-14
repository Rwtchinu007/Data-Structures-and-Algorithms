
import java.util.HashMap;
import java.util.Map;

public class HashMap01{
    public static void main(String[] args) {
    Map<Integer,String> meow = new HashMap<>();    
    meow.put(1, "Chinu");
    meow.put(2, "Mannu");
    meow.put(3, "Chundi");
    for(int key :meow.keySet()){
        System.out.println(key + "->" + meow.get(key));
    }
    for(String s :meow.values()){
        System.out.println(s);
    }
    System.out.println(meow);
    System.out.println(meow.containsKey(1));

    }
}