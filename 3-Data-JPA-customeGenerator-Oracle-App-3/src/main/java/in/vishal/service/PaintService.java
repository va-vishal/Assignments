package in.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vishal.entity.PaintEntity;
import in.vishal.repo.PaintRepo;
import jakarta.persistence.Entity;

@Service
public class PaintService {
	@Autowired
	private PaintRepo repo;
	
	PaintEntity entity=new PaintEntity();
	

}
