package in.vishal.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import in.vishal.entity.PaintEntity;

public interface PaintRepo extends JpaRepository<PaintEntity, Serializable> {

}
