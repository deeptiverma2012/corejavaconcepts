package ThisConcepts;

/* If we write new Ecommerce instead of this keyword, it will also work
but when we add RHS (Ecommerce e =) then it will create an object of the class unnecessarily

* Builder pattern says  every method of the class returns current class object.
  Which creates method chaining.
* It helps to create a workflow of ecommerce / any application
* If we skip return this in any method, chaining will not be continued 
* Only 1 object can tk care of the different workflow sequences for a single user
* 1 object per user. 40 users means 40 objects
*/
public class Ecommerce {
public  Ecommerce login()
{
	System.out.println(" User Logged in");
	return this;// this means object of the current class
}
public Ecommerce login(String username,String passwd)
{
	System.out.println("User Logged in with"+username+" & "+passwd);
	return this;
}
public Ecommerce search(String productName)
{
	System.out.println("Searching with product name");
	return this;
}
public Ecommerce search(String productName, String color)
{
	System.out.println("Searching with "+productName+ color);
	return this;
}
public Ecommerce addToCart(String productName)
{
	System.out.println("Add to cart with"+ productName);
	return this;
}
public Ecommerce checkout(String cc, String cvv)
{
	System.out.println("Checkout with credit card"+ cc+cvv);
	return this;
}
public Ecommerce generateOrderId() 
{
    System.out.println("Your order is confirmed");
    return this;
}
public Ecommerce logout() 
{
    System.out.println("logout");
    return this;
}


}
