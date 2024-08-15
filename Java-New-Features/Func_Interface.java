import java.util.*;
@FunctionalInterface
interface Calculator {
    int sum (int a,int b,int c);
}
public class Func_Interface {
    public static void main(String[] args) {
        Calculator cal = (a,b,c) -> a+b+c;

        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        Integer y = sc.nextInt();
        Integer z = sc.nextInt();

        System.out.println(cal.sum(x,y,z));
    }
}
