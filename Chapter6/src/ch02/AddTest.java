package ch02;

public class AddTest {

	public static void main(String[] args) {

//		Add addL = (x,y) -> {return x + y;};
		// 한 줄의 반환문인 경우에는 return 까지 생략하면 됨.
		Add addL = (x,y) -> x + y;
		
		System.out.println(addL.add(2, 3)); 
	}

}
