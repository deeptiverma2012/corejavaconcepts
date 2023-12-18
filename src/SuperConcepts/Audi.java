package SuperConcepts;

public class Audi extends Car {
	
	int speedLimit =200;
	
	public Audi()
	{
		System.out.println("Audi class default constructor");
	}
	public Audi(int a)
	{
		super();
		System.out.println("Audi class 1 parameterized constructor");
	}
	public Audi(int a, int b)
	{   super(10,20);
		System.out.println("Audi class 2 parameterized constructor");
	}
	
	public void engineNo(int n)
	{
		System.out.println("Audi engine method"+ n);
	}
	@Override
	public void logo()
	{
		System.out.println("BMW logo");
	}
	@Override
	public void chasisNo(int x)
	{
		System.out.println(" BMW chasis no."+ x);
	}
     public void BMWInfo() {
    	 super.chasisNo(50);
    	 System.out.println(super.speedLimit);
    	 
        }
     }
	


