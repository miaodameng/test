package fangfa;


public class f4chongzai {
	public static void main(String[] args) {
		int x = add1(10,20);
		System.out.println(x);
		
		int y = add1(10,20,30);
		System.out.println(y);
	}

	public static int add1(int a, int b) {
		return a+b;
	}
	
	public static int add1(int a, int b, int c) {
		return a+b+c;
	}

}
