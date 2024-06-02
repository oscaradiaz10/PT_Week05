
public class Encapsulation {
	
	public static void main(String[] args) {
		
		// Setter and Getter
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("123");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 12.0);
		rec.setLength(15.0);
		System.out.println(rec.getArea());
		
		/*
		 * Access Modifiers:
		 * public		=> Accessible everywhere
		 * private		=> Only accessible within class itself
		 * protected	=> Only accessible within class itself, other classes in the same package, and all subclasses
		 * no modifier	=> Same as protected, except not accessible in a subclass in different packages 
		 */
	}
}
