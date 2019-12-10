package algorithmten;

/**
 * 选择排序
 *
 * @author fzb
 */
public class SelectionSort {

    /**
     * 未改进的选择排序算法
     * @param num
     * @return
     */
    public int[] selectionSort(int[] num) {
        int temp,cur;
        for (int i=0;i<num.length;i++){
            temp=num[i];
            cur=i;
            for (int j=i+1;j<num.length;j++){
                if (num[j] < temp) {
                    temp=num[j];
                    cur=j;
                }
            }
            if (cur!=i){
                num[cur]=num[i];
                num[i]=temp;
            }
        }
        return num;
    }
}
