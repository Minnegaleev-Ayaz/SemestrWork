import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class StoogeSort  {
    private static long cnt=0;
    private static List<Long> list = new ArrayList<Long>();
    static void sort(List<Integer> a, int start, int end){
        if (a.get(start)>a.get(end)){
            int m = a.get(start);
            a.set(start,a.get(end));
            a.set(end,m);
            cnt+=3;
        }
        if (start+1>=end){
            list.add(cnt);
            iteration();
            return ;
        }
        int tret = (end-start+1)/3;
        cnt++;
        sort(a,start,end-tret);
        sort(a,start+tret,end);
        sort(a,start,end-tret);

    }
    static long iteration(){
        long max=0;
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        list = new ArrayList<Long>();
        return max;
    }
    static long[] globalStoogeSort(List<Integer> a){
        long start = System.currentTimeMillis();
        sort(a,0,a.size()-1);
        long finish = System.currentTimeMillis();
        long[] n = new long[2];
        n[0]=cnt;
        n[1]=finish-start;
        return n;
    }
}
