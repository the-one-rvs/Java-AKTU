import java.util.*;


public class Switch_Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER Choose, a, b respectively");
        String choose = sc.nextLine();
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        switch (choose){
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);break;
            default:
                System.out.println("Error you Entered"+choose);
        }

        //By Switch Expression
        int x = switch (choose){
            case "+" -> {
                yield a+b;
            }
            case "-" -> {
                yield a-b;
            }
//            default -> throw new IllegalStateException("Unexpected value: " + choose);
            default -> {
                yield 0;
            }
        };
        System.out.println("By Switch Expression "+x);
    }
}
