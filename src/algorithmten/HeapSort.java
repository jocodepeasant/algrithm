package algorithmten;

public class HeapSort {

    /**
     * 堆排序
     * @param num
     * @return
     */
    public int[] heapSort(int[] num){
        if (num==null || num.length<2){
            return num;
        }
        //构建大顶堆
        for (int i=num.length/2-1;i>=0;i--){
            //从第一个非叶子结点自下而上,从右到左调整
            adjustHeap(num,i,num.length);
        }
        for (int k=num.length-1;k>0;k--){
            swap(num, 0, k);
            //重新对堆进行调整
            adjustHeap(num,0,k);
        }
        return num;
    }

    /**
     * 交换位置
     * @param num
     * @param i
     * @param k
     */
    private void swap(int[] num, int i, int k) {
        int temp=num[i];
        num[i]=num[k];
        num[k]=temp;
    }

    /**
     * 调整大顶堆
     * @param num
     * @param begin
     * @param length
     */
    private void adjustHeap(int[] num, int begin, int length) {
        int temp=num[begin];
        for (int j=2*begin+1;j<length;j=j*2+1){
            if (j+1<length && num[j]<num[j+1]){
                j++;
            }
            //如果子节点大于父节点，将值赋给父节点（不用进行交换）
            if (num[j]>temp){
                num[begin]=num[j];
                begin=j;
            }
            //由于是自下而上调整故下面已是大顶推结构
            else{
                break;
            }
        }
        //将temp值放到最终的位置
        num[begin]=temp;
    }
}
