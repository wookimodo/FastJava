package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		// 타입을 지정하지 않으면, Object라고 간주되긴 하지만 권장되진 않음.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // Powder로 형변환해줄 필요가 없음.
		System.out.println(powderPrinter.getMaterial());
	}

}
