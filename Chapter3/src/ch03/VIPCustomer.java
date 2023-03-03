package ch03;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		// 부모클래스 생성자가 없다면, 컴파일러가 알아서 생성해줌.
		super();
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	
	public int getAgentID() {
		return agentID;
	}
}

