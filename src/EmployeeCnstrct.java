
public class EmployeeCnstrct {
	String name;
	int id;
	double salary;

	//1. Constructor name should be same as class name
	//2. Constructor has no return type / no void
	//3. Constructor Can't return anything
	//4. Constructor ..is not made for bussiness logic
	//5. Const... helps to initialize the class variables
	//6. Const... is restricting the object creation unnecessarily
	//7. Const.. will be called after creating the object
	/*public EmployeeCnstrct()
	{
		System.out.println("Default Constructor");
	}
	public EmployeeCnstrct(int x)
	{
		System.out.println("One parameterized Constructor");
	}*/
	
	 public EmployeeCnstrct(String name)
	{
		this.name = name;// this.GloabalVariable = LocalVariable
		System.out.println(name);
	}
	 public EmployeeCnstrct(String name, int id)
		{
			this.name = name;
			this.id = id;
			
		}
	 public EmployeeCnstrct(String name,int id,double salary )
		{
			this.name = name;
			this.id = id;
			this.salary = salary;			
		}
	
	public static void main(String[] args) {
		EmployeeCnstrct obj = new EmployeeCnstrct("Tina");
		System.out.println(obj.name+" "+obj.salary);
		obj.salary= 45.55;
		System.out.println(obj.name+" "+obj.salary);
		EmployeeCnstrct obj1 = new EmployeeCnstrct("Deepa", 123);
		System.out.println(obj1.name+" "+obj1.id);
		
		EmployeeCnstrct obj2 = new EmployeeCnstrct("Deepti",124,35.45);
		System.out.println(obj2.name+" "+obj2.id+" "+obj2.salary);
		
		EmployeeCnstrct obj3 = new EmployeeCnstrct(null, 0, 0.0);// here we are creating an object using default values
		//but this constructor will not be a null pointer & g.c will not vanish this object
		System.out.println(obj3.name+" "+ obj3.id+" "+obj3.salary);
		

	}

}
