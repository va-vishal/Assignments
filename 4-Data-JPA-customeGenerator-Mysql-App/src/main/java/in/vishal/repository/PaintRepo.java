package in.vishal.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.vishal.entity.PaintEntity;

@Repository
public interface PaintRepo extends JpaRepository<PaintEntity, Serializable>{

}
