package ThisConcepts;


public class EcommerceTest {

	public static void main(String[] args) {
		Ecommerce ecom = new Ecommerce();
		ecom.login("Deepti@123.com", "knsjcguy68897")
			.search("Sling bags")
				.search("Sling bags", "blue")
					.addToCart("GucciSlingBag")
						.checkout("469986198", "123")
							.generateOrderId()
								.logout();
		//
		
		ecom.login()
		.search("purfumes")
		.addToCart("purfumes")
		.logout();
				
		

	}

}
