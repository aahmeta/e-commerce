package eCommerce.google;

import eCommerce.entities.concretes.Customer;

public class Google implements IGoogle {

	@Override
	public void loginWithGoogle(Customer customer) {
		System.out.println("google ile giriþ yapýldý.");
		
	}

}
