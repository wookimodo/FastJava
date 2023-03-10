package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("-----------------");
		// stream을 생성하고 stream의 여러가지 operation을 사용할 수 있음.
		// forEach 안에는 람다식
		Arrays.stream(arr).forEach(n->System.out.println(n));
		System.out.println("-----------------");
		// IntStream 객체를 반환함.
		IntStream is = Arrays.stream(arr);
		// 이렇게 한 번 연산되고 나면, 소모가 돼서 다시 쓸 수 없게 됨.
		// 한번더 쓰고 싶다면 다시 생성해줘야함.
		is.forEach(n->System.out.println(n));
		System.out.println("-----------------");
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
	}

}
