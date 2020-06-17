package day03;
import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        //打印等腰三角形
        int rows;    //三角形行数
        System.out.print("请输入等腰三角形的行数：");
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}




