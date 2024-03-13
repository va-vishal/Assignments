package in.vishal.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.vishal.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {

	@Autowired
	private ImageService imageService;
	
	@PostMapping("/save")
	public String saveImage(@RequestParam("file") MultipartFile file,
			@RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException {
		return imageService.saveImage(file, name,description);
	}
}