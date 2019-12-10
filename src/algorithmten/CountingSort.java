package algorithmten;

import java.util.HashMap;

public class CountingSort {

    public int[] countingSort(int[] num,int range){
        int[] count=new int[range];
        int[] res=new int[num.length];
        for (int n:num
             ) {
            count[n]++;
        }
        int cur=0;
        for (int i=0;i<count.length;i++){
            for (int j=count[i];j>0;j--){
                res[cur++]=i;
            }
        }
        return res;
    }
}
