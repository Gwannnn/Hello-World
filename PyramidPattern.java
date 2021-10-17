/*
* 第一份idea测试作业：输出金字塔
* author：郑国荣
*     *
     ***
    *****
   *******
  *********
 * */

public class PyramidPattern {
    public static void main(String[] args) {
        for (int i =0;i<=4;i++){
            for (int k=8;k>=i;k--)
                System.out.print(" ");
            for (int j=0;j<=2*i;j++){
                System.out.print("$");
            }
            System.out.println();
        }

    }
}
