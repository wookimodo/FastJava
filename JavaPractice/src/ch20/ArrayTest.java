package ch20;

import java.util.Iterator;

public class ArrayTest {
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		
		for (int i = 0, num=1; i < arr.length; i++) {
			arr[i] = num++;
		}
		// 배열을 다 돌 때 사용
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
		
	}

}
