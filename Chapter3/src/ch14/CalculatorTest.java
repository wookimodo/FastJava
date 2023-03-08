package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		// CompleteCalc는 calc의 타입이라는 것.
		Calc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		// total은 정적 메소드이기 때문에, 인터페이스이름으로 바로 호출.
		System.out.println(Calc.total(arr));
		
	}
}

