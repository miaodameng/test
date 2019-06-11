package fangfa;

import java.util.Scanner;

public class f1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数");
		int y = sc.nextInt();
		
		//int Max = getMax(x,y);
		//System.out.println(Max);
		
		boolean b = isEquals(x,y);
		System.out.println(b);
	}
	
	private static boolean isEquals(int a, int b) {
		
		return a==b;
	}

	public static int getMax(int a,int b) {
		return a>b ? a:b;
	}

}
