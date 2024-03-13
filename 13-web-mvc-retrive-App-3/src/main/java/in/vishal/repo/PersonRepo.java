package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{ 

}
