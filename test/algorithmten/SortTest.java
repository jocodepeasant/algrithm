package algorithmten;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uilts.NumberUtils;

import static org.junit.Assert.*;

public class SortTest {

    private Long before;
    private int[] res;
    private  static final int length=3000000;
    private  static final int max=100000;
    int[] arr;
    int[] bucketArr;

    @Before
    public void before(){
        res=new int[3000000];
        arr = NumberUtils.getRandomArs(length, max);
        bucketArr = NumberUtils.getRandomBetween(length, 1000, 9999);
        before=System.currentTimeMillis();
    }

    @After
    public void after(){
        System.out.println(System.currentTimeMillis()-before);

        for (int i=0;i<500-1;i++){
            if (res[i]>res[i+1]){
                System.out.println("错误");
                return;
            }
        }
        System.out.println("正确");
/*        for (int i=0;i<50;i++){
            System.out.print(bucketArr[i]+" ");
        }
        System.out.println();
        for (int i=2999950;i<3000000;i++){
            System.out.print(bucketArr[i]+" ");
        }
        System.out.println();*/
    }

    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        //原冒泡
        System.out.print("原冒泡:");
        res = bubbleSort.bubbleSort(arr);
    }

    @Test
    public void bubbleSortEx1() {
        BubbleSort bubbleSort = new BubbleSort();
        //冒泡改进1
        System.out.print("冒泡改进1:");
        res = bubbleSort.bubbleSortEx1(arr);
    }

    @Test
    public void bubbleSortEx2() {
        BubbleSort bubbleSort = new BubbleSort();
        //冒泡改进2
        System.out.print("冒泡改进2:");
        res = bubbleSort.bubbleSortEx2(arr);
    }

    @Test
    public void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        //原选择排序
        System.out.print("原选择排序:");
        res = selectionSort.selectionSort(arr);
    }

    @Test
    public void insertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        //原插入排序
        before = System.currentTimeMillis();
        res = insertionSort.insertionSort(arr);
    }

    @Test
    public void insertionSortEx1() {
        InsertionSort insertionSort = new InsertionSort();
        //改进的插入排序1
        System.out.print("改进的插入排序1:");
        res = insertionSort.insertionSortEx1(arr);
    }

    @Test
    public void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        //原归并排序
        System.out.print("原归并排序:");
        res = mergeSort.mergeSort(arr);
    }

    @Test
    public void quickSort() {
        QuickSort quickSort = new QuickSort();
        //原快速排序
        System.out.print("原快速排序:");
        res = quickSort.quickSort(arr);
    }

    @Test
    public void heapSort() {
        HeapSort heapSort=new HeapSort();
        //原堆排序
        System.out.print("原堆排序:");
        res = heapSort.heapSort(arr);
    }

    @Test
    public void countingSort() {
        CountingSort countingSort=new CountingSort();
        //原计数排序
        System.out.print("原计数排序:");
        res = countingSort.countingSort(arr,max);
    }

    @Test
    public void bucketSort() {
        BucketSort bucketSort=new BucketSort();
        //原桶排序
        System.out.print("原桶排序:");
        res = bucketSort.bucketSort(bucketArr);
    }

    @Test
    public void radixSort() {
        RadixSort radixSort=new RadixSort();
        //原桶排序
        System.out.print("原桶排序:");
        radixSort.sort(bucketArr);
    }
}