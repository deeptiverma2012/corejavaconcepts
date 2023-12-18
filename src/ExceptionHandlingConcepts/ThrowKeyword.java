package ExceptionHandlingConcepts;

public class ThrowKeyword {

	public static void main(String[] args) {
		// Throw keyword is used to create cusom exceptions
		
		String url = null;
		
		if(url==null)
		{ 
			try{
				throw new Exception("URL IS NULL");
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}		
			
		}
		else
		{
			System.out.println("Please enter the correct url");
		}

	}

}
