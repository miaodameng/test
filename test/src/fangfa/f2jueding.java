package fangfa;

import java.util.Scanner;

public class f2jueding {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("����������");
	int row = sc.nextInt();
	System.out.println("����������");
	int col = sc.nextInt();
	
	print(row,col);//������һ��Ҫ�����
	}
	
	public static void print(int a,int b) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");//ע�������������println�Ļ�������һ���������ǡ�
			}
			System.out.println();
		}
		return;
	}
}
