
public class InheritanceAbstractionPolymorphism {
	
	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Oscar", "Diaz", 4000.00);
		Employee hourly = new HourlyEmployee("Jacey", "Diaz", 25.00, 1500.0);
		Employee manager = new Manager("Rob", "Lincoln", 45000.0, 8.00);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
