
public class ConditionalOperatorAssignment1 {

	public static void main(String[] args) {
			
	//Answer 1	
		byte a = 25;
		byte b = 78;
		byte c = 87;
		byte d = 97;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("The greatest :"+a);
		}
		else if(b>c && b>d)
		{
			System.out.println("The greatest :"+b);
		}
		else if(c>d)
		{
			System.out.println("The greatest :"+c);
		}
		else{
			System.out.println("The greatest :"+d);
		}
		
/*2. Write a Java program to test a number is positive or negative.
Test Data
Input number: 35 -- positive number
Input number: -11 -- negative number*/
		
		byte a1 = -11;
		
		if(a1> 0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
		
//WAP to check number is odd or even using If - Else		

		byte b1 = 12;
		
		if(b1%2 ==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
		//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char c1 = 'B';
		
		switch (c1) {
		case 'a':
			System.out.println("It's a vowel");
			break;
		case 'e':
			System.out.println("It's a vowel");
			break;	
		case 'i':
			System.out.println("It's a vowel");
			break;
		case 'o':
			System.out.println("It's a vowel");
			break;
		case 'u':
			System.out.println("It's a vowel");
			break;
		default:
			System.out.println("It's a consonant");
			break;
		case 'A':
			System.out.println("It's a vowel");
			break;
		case 'E':
			System.out.println("It's a vowel");
			break;	
		case 'I':
			System.out.println("It's a vowel");
			break;
		case 'O':
			System.out.println("It's a vowel");
			break;
		case 'U':
			System.out.println("It's a vowel");
			break;
		}
		
		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
	
		String environment = "UAT";
		
		switch(environment)
		{
		case "Stage":
			System.out.println("It is Stage environment");
			break;
		case "QA":
			System.out.println("It is QA environment");
			break;
		case "Dev":
			System.out.println("It is Dev environment");
			break;
		case "UAT":
			System.out.println("It is UAT environment");
			break;
			
		case "Prod":
			System.out.println("It is Prod environment");
			break;
		default:
				System.out.println("Please enter a correct environment"+ environment);
			
			break;
			
		}
		
/*WAP to book the specific type of car from the Uber app using Switch - Case. 
Car Type: Mini, Sedan, SUV, Premium
    If user passes wrong car type, print please select the right car type*/
	
	
	String carType ="Sedan";
	switch(carType)
	{
		case "Mini":
		System.out.println("Mini car selected");
		break;
		case "Sedan":
		System.out.println("Sedan car selected");
		break;
		case "SUV":
		System.out.println("SUV  car selected");
		break;
		case "Premium":
		System.out.println("Premium car selected");
		break;
		default:
		System.out.println("please select the right car type ");
		break;
	}
//WAP to launch browsers using If-ElseIf and Switch Case.Browser: Chrome/Firefox/IE/Safar	
		
	String browser = "SAFARI";
	
	switch(browser.toLowerCase().trim())
	{
	case "chrome":
	System.out.println("chrome browser selected");
	break;
	
	case "firefox":
	System.out.println("firefox browser selected");
	break;
	
	case "ie":
		System.out.println("ie browser selected");
		break;
	case "safari":
		System.out.println("safari browser selected");
		break;
		default:
			System.out.println("Please enter correct browser:" +browser);
	
		}
	
	
	String newBrowser = "chrome";
	
	if(newBrowser == "chrome")
	{
		System.out.println("chrome browser selected");
	}
	else if(newBrowser == "safari")
	{
		System.out.println("safari browser selected");
	}
	else if(newBrowser =="firefox")
	{
		System.out.println("firefox browser selected");
	}
	else if(newBrowser =="ie")
	{
		System.out.println("internet explorer selected");
	}
	else
	{
		System.out.println("Please enter correct browser:" +newBrowser);
	}
	
/*WAP to define the interest rate on the basis of Loan type using Switch Case
Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan */
	
	String loanType = "housing loan ";
	double salary = 40000;
	double rateOfInterest;
	
	switch(loanType.toLowerCase().trim())
	{
	case "car loan":
	System.out.println("Rate of interest is 3% ");	
	break;
	case "housing loan":
		if(salary >=35000){
		System.out.println("Rate of interest is 8% ");
		}
		else
		{
			System.out.println("NOT APPLICABLE FOR Housing Loan");
		}
		break;
	case "personal loan":
		System.out.println("Rate of interest is 5% ");
		break;
	case "education loan":
		System.out.println("Rate of interest is 1.5% ");
		break;
	}
	
	
	
	}

}
