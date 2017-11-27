package net.ajay.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.ajay.spring.dto.Account;
import net.ajay.spring.dto.AccountType;
import net.ajay.spring.dto.CustomerDetails;

@Repository
@Transactional
public class CustomerDetailsDaoImpl implements CustomerDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@PersistenceContext
	private EntityManager em;

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public boolean saveCustomerDetails(CustomerDetails customer) {

		boolean status = false;

		try {

			CustomerDetails cust = new CustomerDetails();

			// em.lock(customer, LockModeType.PESSIMISTIC_WRITE);
			AccountType accountType = new AccountType();
			accountType.setAccountDesc("savings type account");
			accountType.setAccountTypeId(1);
			accountType.setAccountType("SB");

			Account account = new Account();
			account.setAccountNumber(customer.getAccount().get(0).getAccountNumber());
			account.setAccountType(accountType);
			account.setActive(true);
			account.setBalance(1000);
			account.setCustomer(cust);

			List<Account> accounts = new ArrayList<>();
			accounts.add(account);

			cust.setAccount(accounts);
			cust.setEmail(customer.getEmail());
			cust.setFirstName(customer.getFirstName());
			cust.setLastName(customer.getLastName());

			sessionFactory.getCurrentSession().save(cust);

			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	@Override
	public CustomerDetails getCustomerDetails(int id) {

		CustomerDetails result = null;

		try {
			Session session = sessionFactory.getCurrentSession();
			result = session.get(CustomerDetails.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerDetails> getAllCustomerDetails() {

		List<CustomerDetails> result = null;

		try {

			String hql = "FROM CustomerDetails as cd ORDER BY cd.id";

			result = (List<CustomerDetails>) hibernateTemplate.find(hql);
			
			
			for(CustomerDetails cd: result)
				Hibernate.initialize(cd.getAccount());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
