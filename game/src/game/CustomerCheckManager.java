package game;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean check(Customer customer) {
		if (customer.getId() == 1 && customer.getFirstName() == "firstName" && customer.getLastName() == "lastName"
				&& customer.getDateOfBirth() == 2001 && customer.getNationalityId() == "1234") {
			return true;
		} 
		return false;
	}	

}
