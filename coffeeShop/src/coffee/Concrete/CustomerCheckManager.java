package coffee.Concrete;

import coffee.Abstract.ICustomerCheckService;
import coffee.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
