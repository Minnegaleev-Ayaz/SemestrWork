import java.util.ArrayList;
import java.util.List;

public class PuzirekSort {
    private static int cnt=0;
    private static List<Integer> list = new ArrayList<Integer>();
    static int sort(List<Integer> a){
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j <a.size()-1 ; j++) {
                if (a.get(i)>a.get(j)){
                    int m = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,m);
                    cnt+=3;
                }
            }
        }
        return cnt;
    }
    static long[] globalSort(List<Integer> a){
        long start = System.currentTimeMillis();
        int  m =sort(a);
        long finish = System.currentTimeMillis();
        long[] b = new long[2];
        b[0]=m;
        b[1]=finish-start;
        return b;
    }
}
