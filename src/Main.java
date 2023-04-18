import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\CheckFiles\\file";
        try {
            OutputStream inp = new FileOutputStream("C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\OutInfo.txt");
            PrintStream print = new PrintStream(inp,true);
            for (int i = 1; i < 101; i++) {
                path = path+i+".txt";
                List<Integer> list = new ArrayList<Integer>();
                list = FileToList.convert(new File(path));
                long[] n = StoogeSort.globalStoogeSort(list);
                print.print(list.size());
                print.print(" ");
                print.print(n[0]);
                print.print(" ");
                print.print(n[1]);
                print.print("\n");
                path = "C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\CheckFiles\\file";
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}