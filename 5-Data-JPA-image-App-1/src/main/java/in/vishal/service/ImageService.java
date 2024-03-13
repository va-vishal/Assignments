package in.vishal.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.vishal.entity.Image;
import in.vishal.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	public ImageRepository imageRepository;
	
	public String saveImage(MultipartFile file,String name,String description) throws IOException
	{
		Image image =new Image();
		image.setName(name);
		image.setDescription(description);
		image.setImage(file.getBytes());
	  imageRepository.save(image);
	  return "image saved in db";
	}
}


	
