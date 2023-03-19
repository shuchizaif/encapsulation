package encapsulation_Assignment;

public class Base {

	public static void main(String[] args) {
		
		
		Person obj = new Person();
		obj.setName("Shuchi");
		obj.setAge(20);
		obj.setGender("Female");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getGender());

	}

}
