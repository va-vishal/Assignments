package in.vishal.service;

import org.springframework.stereotype.Service;

import in.vishal.entity.Address;
import in.vishal.entity.Emp;
import in.vishal.repo.AddressRepo;
import in.vishal.repo.EmpRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private EmpRepo emprepo;
	
	private AddressRepo addressrepo;
	
	public EmployeeService(EmpRepo emprepo,AddressRepo addressrepo)
	{
		this.addressrepo=addressrepo;
		this.emprepo=emprepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveDate()
	{
		Emp e=new Emp();
		e.setEname("chandana");
		e.setEsal(20000.00);
		
		Emp se = emprepo.save(e);
		
		Address ad=new Address();
		ad.setCity("Andhra");
		ad.setState("andhra");
		ad.setCountry("India");
		ad.setType("permanent");
		ad.setEid(se.getEid());
		
		addressrepo.save(ad);
		
}

}
