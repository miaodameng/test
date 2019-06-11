package shuzu;

public class shu4 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		
		System.out.println(arr1);
		System.out.println(arr2);//若在此刻强制输出，则会出现原始地址值。
		
		arr1[0] = 10;
		arr2[1] = 20;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println("---------------------------");
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);//未赋值的元素为0
		
	}

}
