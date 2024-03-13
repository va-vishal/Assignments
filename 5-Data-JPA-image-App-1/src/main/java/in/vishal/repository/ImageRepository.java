package in.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}
