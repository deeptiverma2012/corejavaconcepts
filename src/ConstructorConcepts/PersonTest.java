package ConstructorConcepts;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("Ram",28 ,'M' , 176.5);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.height);
		
		System.out.println("-----------------------------------------------");
		
		Person p1 = new Person("Radha",26 ,'F' , 166);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println(p1.height);
		
		
	}

}
