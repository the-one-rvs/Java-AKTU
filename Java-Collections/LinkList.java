import java.util.*;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(2);
        li.add(3);
        li.add(6);
        li.add(9);
        li.add(17);
        li.set(4,8);
        li.remove(2);

        for (int el:li){
            System.out.println(el);
        }

        System.out.println("---------------------------------------------------------------------------------------");

        Iterator<Integer> itr = li.iterator();
        while (itr.hasNext()){
            Integer el = itr.next();
            System.out.println(el);
        }

        System.out.println("---------------------------------------------------------------------------------------");

        for (int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

    }
}
