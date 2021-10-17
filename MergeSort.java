/*
* 第三次作业：递归排序/归并排序
* author：郑国荣
 */
public class MergeSort {
    static int[] array ={2,1,8,5,4,6,2};

    public static void main(String[] args) {
        System.out.println("排序前的数组：");
        printArray(array,0, array.length-1);

        mergeSort(0, array.length-1);
        System.out.println("排序后的数组：");
        printArray(array,0, array.length-1);
    }
//分组
    public static void mergeSort(int start,int end){
        int mid=(start+end)/2;
        if (start<end){
            mergeSort(start,mid);//递归再分
            mergeSort(mid+1,end);
            merge(start,mid,end);
        }
    }
//合并
    private static void merge(int start,int mid, int end) {
        int []tempArray=new int[array.length];
        int tempStart = start;

        System.out.println("合并前：");
        printArray(array,start,mid);
        printArray(array,mid+1,end);

        int startIndex = start;
        int midIndex = mid+1;
        while(startIndex<=mid&&midIndex<=end){
            if (array[startIndex]< array[midIndex]){
                tempArray[tempStart++]= array[startIndex++];
            }
            else {
                tempArray[tempStart++]= array[midIndex++];
            }
        }
//剩下的依次排入
        while (startIndex<=mid){
            tempArray[tempStart++]= array[startIndex++];
        }
        while (midIndex<=end){
            tempArray[tempStart++]= array[midIndex++];
        }
//拷贝数组
        for (int i=start;i<=end;i++){
            array[i]=tempArray[i];
        }

        System.out.println("合并后：");
        printArray(tempArray,start,end);

    }

    public static void printArray(int []arr, int start , int end){
        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
