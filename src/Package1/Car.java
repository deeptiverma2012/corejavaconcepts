package Package1;

public class Car {
	
	/*es, an overridden method can have a different access modifier but it cannot lower the access scope.

The following rules for inherited methods are enforced -

Methods declared public in a superclass also must be public in all subclasses.
Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.
Methods declared private are not inherited at all, so there is no rule for them.
Methods declared default can be converted into public*/

	// Access specifiers
	public String carName;
	private int price;
	protected int modelNo;
	String color;
	
	protected void protectedMethod()
	{
		System.out.println("Car class --- Protected");
	}
	
	public void CarMethod()
	{
		System.out.println("Car class  --- public method");
	}
	private void CarMethod1()
	{
		System.out.println("Car class  --- private method");
	}
	void CarMethod2()
	{
		System.out.println("Car class  --- default method");
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.carName= "BMW";
		c1.price = 450000;
		c1.modelNo = 518687;
		c1.color = "Red";
		
		
		
		
		

	}

}
