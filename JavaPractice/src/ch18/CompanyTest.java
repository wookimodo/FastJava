package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 주소가 같음. 유일한 객체를 제공할 때 싱글톤 패턴을 사용한다.
		System.out.println(company1);
		System.out.println(company2);
		
		// new Calendar로 만들 수 없음. 유일한 객체를 제공하기 위해서.
		Calendar calendar = Calendar.getInstance();
	}

}
