package ch01;

class Outter2{
	
	// Runnable은 클래스를 쓰레드화할 때 사용하는 인터페이스
	Runnable getRunnable(int i){

		int num = 100;
		// Runnable를 구현하는 새로운 클래스를 만들지 말고, 바로 Runnable 객체를 생성하면서 그 안에 method를 구현함.
		// 이게 익명클래스 방식
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	
	// 이런식으로도 가능.
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
	
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
	}
}
