package in.vishal;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public void generateExcel(HttpServletResponse response) throws IOException
	{
		List<Book> books = bookRepo.findAll();
		
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("book_info");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Author");
		row.createCell(2).setCellValue("pageCount");
		row.createCell(3).setCellValue("Title");
		
		int index=1;
		
		for(Book book : books)
		{
			HSSFRow dr = sheet.createRow(index);
			dr.createCell(0).setCellValue(book.getId());
			dr.createCell(1).setCellValue(book.getAuthor());
			dr.createCell(2).setCellValue(book.getPageCount());
			dr.createCell(3).setCellValue(book.getTitle());
			index ++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
		
	
	}

}
