import java.util.*;
public class HshMap {
    public static void main(String[] args) {
        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(1,"sdfg");
        mp.put(5,"dfvbsd");
        mp.put(3,"qwertyuiop");
        // Traversing Map by Iterator
//        Set st = mp.entrySet();
//        Iterator it = st.iterator();
//        while (it.hasNext()){
//            Map.Entry entry = (Map.Entry)it.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
         for (Map.Entry it:mp.entrySet()){
             System.out.println(it.getKey()+" "+it.getValue());
         }
    }
}
