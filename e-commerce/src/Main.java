import java.util.ArrayList;
import java.util.List;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.dataAccess.concretes.AbcCustomerDao;
import eCommerce.entities.concretes.Customer;
import eCommerce.google.IGoogle;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer = new Customer(1, "abc", "abc", "adc@hotmail.com", "123456");
		Customer customer2 = new Customer(2, "bca", "bca", "abc@hotmail.com", "123456");
		
		customerList.add(customer);
		customerList.add(customer2);
		
		for (Customer customers : customerList) {
			System.out.println(customers.getEmail());
		}
		
		CustomerService customerService = new CustomerManager(new AbcCustomerDao());
		customerService.register(customer);
		customerService.mailOnay(customer);
		customerService.register(customer2);	
		customerService.mailOnay(customer2);
			
	}

}
