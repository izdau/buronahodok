package kz.buronahodok.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class LostAndFoundControllerTest {
	
	LostAndFoundController ctrl = new LostAndFoundController();
	
	@Test
	public void testgetUniqueFormId() {		
		Date currentDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String uniqueFormId = format.format(currentDate);
		
		System.out.println(uniqueFormId);
	}

}
