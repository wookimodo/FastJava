package ch06;

public class GenericPrinter<T> {
	// material에 무슨 타입이 오든 상관없도록.
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toSring() {
		return material.toString();
	}
}
