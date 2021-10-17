/*
*第四次作业：冒泡排序
* author：郑国荣
*
**/

public class BubbleSort {
    static int a[]={2,1,8,5,4,6,2};

    public static void main(String[] args) {
        System.out.println("排序前：");
        printArray(a,0, a.length-1);
        sort(a,0,a.length-1);
        System.out.println("排序后：");
        printArray(a,0, a.length-1);
    }

    private static void sort(int[] a, int start, int end) {
        int temp;
        int tempArray[]=new int[a.length];
        for (int i=0;i<=end;i++){
            for (int j=0;j<=end;j++)
            if(a[i]<=a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    public static void printArray (int []arr,int start , int end){
        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


