import java.util.*;
public class TreMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new TreeMap<>();
        mp.put("First",1);
        mp.put("Second",2);
        mp.put("Third",3);
        mp.put("Fourth",4);
        mp.put("Five",5);
        mp.replace("Third",33);
        //Removing
        mp.remove("Five");

        //The Map Key and Values
        for (Map.Entry<String,Integer> it:mp.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
}
