package algorithmten;

public class QuickSort {

    /**
     * 快速排序
     * @param num
     * @return
     */
    public int[] quickSort(int[] num){
        if (num==null || num.length==0){
            return null;
        }
        return quickSort1(num,0,num.length-1);
    }

    private int[] quickSort1(int[] num, int left, int right) {
        if (left>=right){
            return null;
        }
        int low=left,high=right,index=num[left];
        while(low<high){
            //向左寻找第一个小于等于基准值的数
            while(low<high && num[high]>=index){
                high--;
            }
            //填入值
            if (low<high){
                num[low++]=num[high];
            }
            //向右寻找第一个大于基准值的值
            while (low<high && num[low]<index){
                low++;
            }
            //填入值
            if(low<high){
                num[high--]=num[low];
            }
        }
        //将基准值填入最后的坑
        num[low]=index;

        int[] res;

        quickSort1(num,left,low-1);
        quickSort1(num,low+1,right);

        return num;
    }
}
