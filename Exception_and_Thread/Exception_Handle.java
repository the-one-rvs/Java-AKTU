import java.util.Scanner;

class Divide {
    public void expect(int n) throws Exception{
        int x = n/4;
        System.out.println(x);
    };
}

public class Exception_Handle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        while(true) {
            int div = sc.nextInt();
            int ind = sc.nextInt();
            try {
                int ans = arr[ind] / div;
                System.out.println(ans);
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                break;
            } finally {
                if (div == 0) {
                    throw new ArithmeticException("divided by zero");
                }
                else if (ind >= n){
                    throw new ArrayIndexOutOfBoundsException("ind is greater than n");
                }
                else{
                    System.out.println("Working Fine");
                }
            }

            Divide d = new Divide();
            try {
                d.expect(8);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
