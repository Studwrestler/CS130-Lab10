package lab10;

class Person {
	private String name;
	private int age;
	public Person (String initialName) {
		this.name=initialName;
		this.age=0;
	}
	public void printPerson() {
		System.out.println(this.name+" is "+ this.age +" years old");
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public static void main(String[]args) {
		Person p1 = new Person("Chase");
		Person p2 = new Person("Marti");
		Person p3 = new Person("Aung");
		Person p4 = new Person("Kailey");
		Person p5 = new Person("Sam");
		Person p6 = new Person("Tyler");
		Person p7 = new Person("Tavius");
		p1.setAge(18);
		p1.printPerson();
		p2.setAge(18);
		p2.printPerson();
		p3.setAge(18);
		p3.printPerson();
		p4.setAge(20);
		p4.printPerson();
		p5.setAge(18);
		p5.printPerson();
		p6.setAge(18);
		p6.printPerson();
		p7.setAge(18);
		p7.printPerson();
		
	}
}
