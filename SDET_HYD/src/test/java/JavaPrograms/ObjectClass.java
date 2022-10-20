package JavaPrograms;

public class ObjectClass {
	
	int age;
	String name;
	ObjectClass(int age,String name){
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "ObjectClass [age=" + age + ", name=" + name + "]";
	} 

	public static void main(String[] args) {
		
      ObjectClass o=new ObjectClass(29,"RAJA");
      System.out.println(o);
	}

}
