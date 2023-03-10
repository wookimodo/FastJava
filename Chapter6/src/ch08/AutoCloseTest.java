package ch08;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj){
			// exception이 강제로 발생되도록.
			throw new Exception();
		}catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("end");
	}

}
