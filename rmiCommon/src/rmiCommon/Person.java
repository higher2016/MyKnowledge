package rmiCommon;

// 远程调用对象的方法所返回的对象一定是要实现序列化的
public class Person implements java.io.Serializable {

	private static final long serialVersionUID = -9156411713118961501L;

	private String name;
	private int age;

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

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
