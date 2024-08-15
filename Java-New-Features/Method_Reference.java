interface A{
    void sum(int a,int b);
}
class B{
    static void add(int x,int y) {
        int c = x + y;
        System.out.println("Sum=" + c);
    }
}
//without static
class C{
    void add(int x,int y) {
        int c = x + y;
        System.out.println("Sum=" + c);
    }
}

public class Method_Reference {
    public static void main(String[] args) {
        A a = B :: add;
        a.sum(10,20);

        C c = new C();
        A ax = c::add;
        ax.sum(10,20);

    }
}
