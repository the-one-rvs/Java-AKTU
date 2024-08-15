import java.util.Stack;

public class Stck {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.add("Vasja");
        stk.add(3);
        for (Object obj:stk){
            System.out.println(obj);
        }
    }
}
