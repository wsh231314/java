package java_training.co.jp.collection;

public class TestUnit {

	private String name = "";
	private int age = 0;
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
	
	public String toString() {
		return name + ":" + String.valueOf(age);
	}
	
	public void resetName() {
		name = "superman:".concat(name);
	}
}
