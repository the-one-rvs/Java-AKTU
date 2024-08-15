import java.util.*;

class Pro implements Comparable<Pro> {
    int pcode;
    String name;
    int price;

    public Pro(int pcode, String name, int price) {
        this.pcode = pcode;
        this.name = name;
        this.price = price;
    }

    public String obj() {
        return pcode + " : " + name + " = " + price;
    }

    @Override
    public int compareTo(Pro p) {
        if (this.price > p.price) {
            return 1;
        } else if (this.price == p.price) {
            return 0;
        } else {
            return -1;
        }
    }

}

public class Comp {
    public static void main(String[] args) {
        TreeSet<Pro> ts = new TreeSet<>();
        ts.add(new Pro(14, "MRF Bat", 1500));
        ts.add(new Pro(15, "Leather Ball", 250));
        ts.add(new Pro(13, "CEAT Bat", 2000));

        for (Pro p : ts) {
            System.out.println(p.obj());
        }
    }
}
