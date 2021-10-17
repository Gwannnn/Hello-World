/*
* 第二份作业：输出九九乘法表
* author：郑国荣
* 以 *
*    **
*    ***
*    **** 的形状列表
* */

public class TimeTable99 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){//如这一行，j=i就跳到下一行，即1*1、2*2……
                System.out.print(j+"*"+i+"="+i*j+" ");//这里将j和i位置颠倒，列数随行数增加
            }
            System.out.println();
        }
    }
}
