package InheritanceConcepts;

public class Motor extends RunEngine {
	public void moveAbles()
	{
		System.out.println("Motor --- Movables");
	}
	@Override
	public void runAble()
	{
		System.out.println("Motor ---- run able");
	}

}
