package icici.ta.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icici.ta.entity.Cus;
import icici.ta.pojo.CustomerPojo;
import icici.ta.repository.CustomerRepository;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void saveCustomer(CustomerPojo customerPojo) {

		System.out.println("Customer Service.....");

		Cus cus = new Cus();
		cus.setFirstName(customerPojo.getFirstName());
		cus.setLastName(customerPojo.getLastName());
		customerRepository.save(cus);
		customerPojo.setId(cus.getId());

	}

	public CustomerPojo findByFirstName(String firstName) {

		Cus customer = customerRepository.findByFirstName(firstName);

		CustomerPojo customerPojo = new CustomerPojo();

		if (customer != null) {

			customerPojo.setId(customer.getId());
			customerPojo.setFirstName(customer.getFirstName());
			customerPojo.setLastName(customer.getLastName());

		}
		return customerPojo;

	}

	@Override
	public List<CustomerPojo> retrieveByFirstName(String fistName) {

		List<CustomerPojo> customerPojoList = new ArrayList<CustomerPojo>();

		List<Cus> cus = customerRepository.retrieveByFirstName(fistName);
		
		System.out.println(cus.size());

		for (Cus customer : cus) {
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setId(customer.getId());
			customerPojo.setFirstName(customer.getFirstName());
			customerPojo.setLastName(customer.getLastName());

			customerPojoList.add(customerPojo);
		}

		return customerPojoList;

	}

}
