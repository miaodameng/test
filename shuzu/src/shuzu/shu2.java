package shuzu;

public class shu2 {
	public static void main(String[] args) {
		int[] arr = new int[5];//动态初始化，在内存中开辟连续的五块空间
		System.out.println(arr[0]);//系统默认初始值为0
		
		arr[0] = 10;
		
		System.out.println(arr[0]);
	}

}
