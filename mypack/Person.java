package mypack;

public abstract class Person {
	protected String name;
	protected int age;
	protected float height;


	public Person(){
		
	}

	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void walk(String address) {
		System.out.println(this.getName() + " dang di bo den " + address);
	}

	public void getInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Height: " + this.getHeight());
	}
}