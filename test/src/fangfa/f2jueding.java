package fangfa;

import java.util.Scanner;

public class f2jueding {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入行数");
	int row = sc.nextInt();
	System.out.println("请输入列数");
	int col = sc.nextInt();
	
	print(row,col);//主函数一定要输出。
	}
	
	public static void print(int a,int b) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");//注意这里如果加上println的话，就是一竖列六个星。
			}
			System.out.println();
		}
		return;
	}
}
