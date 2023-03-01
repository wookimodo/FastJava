package ch18;

public class Company {
	
	private static Company instance = new Company();
	
	// 외부에서 company를 생성할 수 없도록 생성자를 private으로 만든다.
	private Company() {
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
