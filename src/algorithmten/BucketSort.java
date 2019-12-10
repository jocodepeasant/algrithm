package algorithmten;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    /**
     * 桶排序(桶数量为10)
     * @param array
     * @return
     */
    public int[] bucketSort(int[] array) {
        List<Integer>[] bucket =new ArrayList[10];
        int length=array.length;
        int temp;
        for (int i=0;i<length;i++){
            temp=get(array[i]);
            if (bucket[temp]==null){
                bucket[temp]=new ArrayList<>();
            }
            bucket[temp].add(array[i]);
        }
        int cut=0;
        for (int j=0;j<10;j++){
            if (bucket[j]!=null) {
                insertSort(bucket[j]);
                for (Integer n : bucket[j]
                ) {
                    array[cut++] = n;
                }
            }
        }
        return array;
    }

    private void insertSort(List<Integer> list) {
        Collections.sort(list);
    }

    /**
     * 取最高位的值
     * @param num
     * @return
     */
    public int get(int num){
        while(num>=10){
            num=num/10;
        }
        return num;
    }
}
