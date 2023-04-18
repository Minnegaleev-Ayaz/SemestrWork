import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\123.txt";
        List<Integer> a = FileToList.convert(new File(path));
        System.out.println(a);
       /* for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }*/
    }
}
