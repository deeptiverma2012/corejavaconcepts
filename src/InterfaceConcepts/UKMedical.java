package InterfaceConcepts;

// No method body/ only method declaration --- Abstract methods
//Q: Can we declare methods with Abstract keyword in an interface? like public abstract void pediatricServices();
//A: Yes, we can declare methods with abstract keyword but methods in interface are abstract by default. So, there is no need to write abstract.
/* We cannot create the object of an interface in java 
 * because it doesn't have any business logic or implementation inside the interface.*/
  

public interface UKMedical {

	public void pediatricServices();
	public void psychitricServices();
	public void emergencyServices();
}
