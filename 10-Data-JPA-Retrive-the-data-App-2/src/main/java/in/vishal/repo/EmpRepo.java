package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
