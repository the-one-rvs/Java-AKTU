import java.io.*;
import java.util.*;
public class Property {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //Setting properties
        prop.setProperty("database.url","database url details");
        prop.setProperty("database.username","root");
        prop.setProperty("database.password","*********");
        //Saving Properties to a file
        try (FileOutputStream fos = new FileOutputStream("config.properties")){
            prop.store(fos, "Database Configuration");
            System.out.println("Properties Saved Successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
