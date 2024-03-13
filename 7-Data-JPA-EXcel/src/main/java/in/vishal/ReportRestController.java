package in.vishal;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {

	@Autowired 
	private ReportService repoService;
	
	@GetMapping("/mama")
	public void generateExcel(HttpServletResponse response) throws IOException
	{
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition","attachment;filename=books.xls");
		
		repoService.generateExcel(response);
	}
}
