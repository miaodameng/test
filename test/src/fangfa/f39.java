package fangfa;

import java.util.Scanner;

public class f39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��1-9֮�������");
		int x = sc.nextInt();
		
		print99(x);
		
	}
	public static void print99(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}


	}

}
