package coffee.adapters;

import java.rmi.RemoteException;

import coffee.Abstract.ICustomerCheckService;
import coffee.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		Long longNationalityId = Long.parseLong(customer.getNationalityId());
		return client.TCKimlikNoDogrula(longNationalityId, customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), customer.getDateOfBirth());
	}

}
