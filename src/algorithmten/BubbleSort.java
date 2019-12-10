package algorithmten;

/**
 * @author fzb
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 未改进的冒泡排序算法
     * @param num1
     * @return
     */
    public int[] bubbleSort(int[] num1){
        if (num1==null || num1.length==0){
            return null;
        }
        int temp;
        for(int i=0;i<num1.length;i++){
            for (int j=0;j<num1.length-1;j++){
                if (num1[j]>num1[j+1]){
                    temp=num1[j];
                    num1[j]=num1[j+1];
                    num1[j+1]=temp;
                }
            }
        }
        return num1;
    }

    /**
     * 改进的冒泡排序算法1
     * @param num1
     * @return
     */
    public int[] bubbleSortEx1(int[] num1){
        if (num1==null || num1.length==0){
            return null;
        }
        int temp;
        for(int i=0;i<num1.length;i++){
            for (int j=0;j<num1.length-1-i;j++){
                if (num1[j]>num1[j+1]){
                    temp=num1[j];
                    num1[j]=num1[j+1];
                    num1[j+1]=temp;
                }
            }
        }
        return num1;
    }

    /**
     * 改进的冒泡排序算法2
     * @param num1
     * @return
     */
    public int[] bubbleSortEx2(int[] num1){
        if (num1==null || num1.length==0){
            return null;
        }
        int temp,cur;
        int i=num1.length-1;
        while(i>0){
            cur=0;
            for (int j=0;j<i;j++){
                if (num1[j]>num1[j+1]){
                    temp=num1[j];
                    num1[j]=num1[j+1];
                    num1[j+1]=temp;
                    cur=j;
                }
            }
            i=cur;
        }
        return num1;
    }
}
