package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber m = (x,y)-> x>y? x:y;
		
		System.out.println(m.getMax(10, 20));
	}	
}
