package shuzu;

public class shu5 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = arr2;
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		arr1[0] = 10;
		arr1[1] = 20;
		
		arr2[1] = 30;
		arr3[1] = 40;
		arr3[2] = 50;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("--------------------");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);//40
		System.out.println(arr2[2]);//50
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
	}

}
