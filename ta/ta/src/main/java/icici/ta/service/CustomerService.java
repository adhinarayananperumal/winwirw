package icici.ta.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import icici.ta.entity.Cus;
import icici.ta.pojo.CustomerPojo;


public interface CustomerService {
	
	void saveCustomer(CustomerPojo customerPojo);
	
	CustomerPojo findByFirstName(String firstName);
	
	List<CustomerPojo> retrieveByFirstName(String fistName);
}
