package JavaPrograms;

import java.util.Objects;

public class EqualsMethod extends Object {
 int age;
 String name;
 long salary;
 
	public EqualsMethod(int age, String name, long salary) {
	super();
	this.age = age;
	this.name = name;
	this.salary = salary;
}

	@Override
	public String toString() {
		return "EqualsMethod [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age,name,salary);
	}


	@Override
	public boolean equals(Object obj) {
		
		EqualsMethod other = (EqualsMethod) obj;
		return age == other.age && name.equals( other.name) && salary == other.salary;
	}

	public static void main(String[] args) {
		EqualsMethod o= new EqualsMethod(28,"RAJA",100000);
		System.out.println(o);
		System.out.println(o.hashCode());
		
		EqualsMethod o1= new EqualsMethod(28,"RAJA",100000);
		System.out.println(o1);
		System.out.println(o.equals(o1));
		System.out.println(o1.hashCode());
	}

}
