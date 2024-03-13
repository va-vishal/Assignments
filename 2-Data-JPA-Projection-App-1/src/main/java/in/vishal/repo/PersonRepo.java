package in.vishal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Person;
import in.vishal.projection.NameAgeProjection;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{
	
	@Query("SELECT p.name as name, p.age as age FROM Person p")
    List<NameAgeProjection> findNameAge();

}
