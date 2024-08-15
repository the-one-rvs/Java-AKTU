import java.util.*;
public class Base_64 {
    public static void main(String[] args) {
        System.out.println("Enter a string ->>");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        byte[] b = str.getBytes();
        String base64 = Base64.getEncoder().encodeToString(b);
        System.out.println(base64);

        byte[] decode = Base64.getDecoder().decode(base64);
        String dcd = new String(decode);
        System.out.println(dcd);
    }

}
