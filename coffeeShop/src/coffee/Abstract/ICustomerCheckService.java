package coffee.Abstract;

import java.rmi.RemoteException;

import coffee.Entities.Customer;

		public interface ICustomerCheckService {
			
		boolean checkIfRealPerson(Customer customer) throws RemoteException;
	}
