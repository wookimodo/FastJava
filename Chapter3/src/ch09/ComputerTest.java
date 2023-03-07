package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		desktop.display();
		// 추상 클래스는 new로 생성 불가
		// Computer computer = new Computer();
	}

}
