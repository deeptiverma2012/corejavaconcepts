package InheritanceAssignment;

public interface USAffiliation extends WorldEducationCentre {
	//public USAffiliation(); We cannot create constructor of an interface
	
	// An interface has all the abstract methods by default. There is no need to explicitly mention abstract
	// Abstract methods are methods without body
	public void bachlors();
	public void masters();
	public void diploma();
	

}
