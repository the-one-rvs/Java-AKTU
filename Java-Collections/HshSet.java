import java.util.*;
public class HshSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(5);
        hs.add(2);
        hs.add(4);
        for (int i=100;i>0;i--){
            hs.add(i);
        }
        hs.remove(50);
        System.out.println(hs.size());
        for (int item:hs){
            System.out.println(item);
        }
        Boolean b = hs.contains(50); //O(1)
        System.out.println(b);

        HashSet<String> set_str = new HashSet<>();
        set_str.add("zrew");
        set_str.add("ewrewqsfe");

        for (String str:set_str){
            System.out.println(str);
        }

    }
}
