import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileToList {
    static List<Integer> convert(File file){
        List<Integer> a = new ArrayList<Integer>();
        try {
            InputStream input = new FileInputStream(file);
            Reader inp = new FileReader(file);
            BufferedReader in =new BufferedReader(inp);
            String b;
            while ((b=in.readLine())!= null){
                a.add(Integer.parseInt(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return a;
    }
}
