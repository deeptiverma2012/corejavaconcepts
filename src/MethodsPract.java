
public class MethodsPract {
// WAF to get students marks
// parameter: String studentName
// return: int marks
	
	public int getStudentsMarks(String studentName)
	{
		int marks =-1;
		if(studentName.equals("Deepti"))
		{
			marks = 100;
		}
		else if(studentName.equals("Jay"))
		{
			marks = 35;
		}
		else if(studentName.equals("Shivi"))
		{
			marks = 55;
		}
		else
		{
			System.out.println("Please enter a valid student name"+ studentName);
		}
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsPract obj = new MethodsPract();
		int marks =obj.getStudentsMarks("Tom");
		System.out.println(marks);

	}

}
