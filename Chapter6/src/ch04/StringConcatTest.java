package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";

		// 클래스를 생성해서 구현하는 방식.
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1,s2);
		
		// 이렇게 람다식을 쓰면 익명클래스가 생성됨. 클래스 없이 이루어지는 것은 아니라는 점.
		StringConcat concat = (s,v)->System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
	}

}
