
public class HourlyEmployee extends Employee{
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
	}

	private double hoursWorked;
	
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * hoursWorked;
	}
	
}
