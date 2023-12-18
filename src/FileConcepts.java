
public class FileConcepts {

	static String name = "FileX";
	int pageNo;
	
	public static void readFile(FileConcepts f)
	{
		System.out.println("Read File");
	//sendFile();// It will show warning: Cannot make a static reference to the non-static method sendFile() from the type FileConcepts
		//FileConcepts obj = new FileConcepts(); to avoid creating multiple object, use calla by reference
		f.sendFile();
	}
	
	public void sendFile()
	{
		System.out.println("Send File");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileConcepts obj1 = new FileConcepts();
		int x = obj1.pageNo =5;
		System.out.println(x);		
		String s =FileConcepts.name;
		System.out.println(s);
		FileConcepts.readFile(obj1);
	}

}
