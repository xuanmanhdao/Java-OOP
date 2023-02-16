package mypack;

public class Person {
	protected String name;
	protected int age;
	protected float height;

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
}