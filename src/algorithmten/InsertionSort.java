package algorithmten;

/**
 * 插入排序
 *
 * @author fzb
 */
public class InsertionSort {

    /**
     * 原插入排序
     * @param num
     * @return
     */
    public int[] insertionSort(int[] num){
        int temp,cur;
        for (int i=1;i<num.length;i++){
            cur=i-1;
            temp = num[i];
            while (cur>=0 && temp<num[cur]){
                    num[cur+1]=num[cur--];
                }
            num[cur+1] = temp;
        }
        return num;
    }

    /**
     * 改进的插入排序1(查找插入位置时使用二分查找的方式)
     * @param num
     * @return
     */
    public int[] insertionSortEx1(int[] num){
        int temp,left,right,middle;
        for (int i=1;i<num.length;i++){
            temp = num[i];
            left=0;
            right=i-1;
            while(left<=right){
                middle=(left+right)/2;
                if(num[middle]>temp){
                    right=middle-1;
                }
                else {
                    left=middle+1;
                }
            }
            for (int j=i-1;j>=left;j--){
                num[j+1]=num[j];
            }
            num[left]=temp;
        }
        return num;
    }
}
