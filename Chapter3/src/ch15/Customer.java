package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer sell");
		
	}
	// 메소드가 중복되었기 때문에 반드시 재정의를 해줘야 함.
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("customer hello");
	}

}
