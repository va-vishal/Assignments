package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
