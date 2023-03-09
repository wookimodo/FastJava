package ch07;

public class Point<T, V> {
	// integer, double 뭐가 들어올지 모를때
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {
			return x;
	}

	public V getY() {
		return y;
    }
}

