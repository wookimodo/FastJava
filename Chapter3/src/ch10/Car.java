package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 이런 시나리오를 가진 메소드를 변경할 수 없도록 final로 선언.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
