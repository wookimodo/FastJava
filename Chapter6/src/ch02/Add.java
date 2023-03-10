package ch02;

@FunctionalInterface
// FunctionalInterface라고 선언하면, 메서드를 2개 이상 선언하면 안됨.
public interface Add {
	// 2개 이상의 메서드를 선언해버리면, 구현할 때 무슨 메서드를 구현한 것인지 모호해짐.
	public int add(int x, int y);
}
