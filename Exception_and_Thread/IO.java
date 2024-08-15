import java.io.*;

public class IO {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(33);
        fos.write(90);
        byte[] b = {63, 77, 29, 32};
        fos.write(b);
        fos.close();

        FileInputStream fis = new FileInputStream("a.txt");
        int byte1 = fis.read();
        System.out.println(byte1);
        fis.close();

        FileWriter fw = new FileWriter("b.txt");
        fw.write(33);
        fw.write(90);
        char[] charArray = {63, 77, 29, 32};
        fw.write(charArray);
        fw.close();

        FileReader fr = new FileReader("b.txt");
        int char1 = fr.read();
        System.out.println(char1);
        fr.close();
    }
}
