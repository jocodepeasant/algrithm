package algorithmten;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author fzb
 */
public class MergeSort {

    public int[] mergeSort(int[] num) {
        int length=num.length;
        if (num==null || length<2){
            return num;
        }
        int middle=(int)Math.floor(length/2);
        int[] left= Arrays.copyOfRange(num,0,middle);
        int[] right=Arrays.copyOfRange(num,middle,length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] res=new int[left.length+right.length];
        int cur=0,leftcur=0,rightcur=0;
        while(left.length>leftcur && right.length>rightcur){
            if (left[leftcur]<=right[rightcur]){
                res[cur++]=left[leftcur++];
            }
            else{
                res[cur++]=right[rightcur++];
            }
        }
        while(left.length>leftcur){
            res[cur++]=left[leftcur++];
        }
        while (right.length>rightcur){
            res[cur++]=right[rightcur++];
        }
        return res;
    }
}
