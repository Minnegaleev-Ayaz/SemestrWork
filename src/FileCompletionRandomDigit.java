import java.io.*;

public class FileCompletionRandomDigit {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        String name = "C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\CheckFiles\\file";
        int b;
        for (int i = 1; i < 101; i++) {
            String path = name+i+".txt";
            try {
                OutputStream output = new FileOutputStream(path,false);
                PrintStream stream = new PrintStream(output);
                for (int j = 0; j < i*20; j++) {
                    stream.print((int) (Math.random()*100000)+"\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long finish = System.currentTimeMillis();
        double result=(finish-start)/1e3;
        try {
            OutputStream time = new FileOutputStream("C:\\Users\\User\\Desktop\\project\\AlgorithmsAndDataStructures\\src\\TimeMakingCompletion.txt");
            PrintStream s = new PrintStream(time);
            s.print(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
