
public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		u1.name="Riya";
		u1.age = 25;
		u1.city = "Delhi";
		
		User u2 = new User();
		u2.name = "Divya";
		u2.city ="Mumbai";
		
		User u3 = new User();
		u3.name = "Pari";
		u3.city= "Lonavala";
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println("--------------------------------------");
		
		User u4 = new User();
		u4.name ="Arby";
		u1 = u2;
		
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		
		System.out.println("--------------------------------------");
     	u2=u3;		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("--------------------------------------");
		
		u3=u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("--------------------------------------");

		u4=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("--------------------------------------");
	}

}
