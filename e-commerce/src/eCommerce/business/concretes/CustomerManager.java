package eCommerce.business.concretes;

import java.util.regex.Pattern;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	String regex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	Pattern pattern = Pattern.compile(regex);
	
	@Override
	public void register(Customer customer) {
		if(customer.getFirstName().length() < 3 || customer.getLastName().length() < 3) {
			System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
			return;
		}
		
		else if (customer.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return;
		}
		
		else if (!pattern.matcher(customer.getEmail()).matches()) {
			System.out.println("mail doðru deðil");
			return;
		}
		
		else{
			this.customerDao.add(customer);
			this.customerDao.dogrulamaili(customer);
			System.out.println("Üyelik tamamlanmasý için mail doðrulanmalýdýr. " + customer.getEmail());
			}
		
	}
	
	@Override
	public void mailOnay(Customer customer) {
		System.out.println(customer.getEmail()+ " Mail doðrulandý.");
		
	}
	
	@Override
	public void login(Customer customer) {
		
		
	}

	

}
