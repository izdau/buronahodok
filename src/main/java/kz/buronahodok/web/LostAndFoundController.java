package kz.buronahodok.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import kz.buronahodok.domain.LostAndFound;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lostandfounds")
@Controller
@RooWebScaffold(path = "lostandfounds", formBackingObject = LostAndFound.class)
public class LostAndFoundController {
	
	private static Logger logger = Logger.getLogger(LostAndFoundController.class);

	@RequestMapping(value = "/save", 
			method = RequestMethod.POST, 
			consumes = "application/json", 
			produces = "application/json")
	@ResponseBody
	public boolean save(@RequestBody LostAndFound lostAndFound) {
		logger.debug("Received /lostandfounds/save POST call: " + lostAndFound);
		
		lostAndFound.setFormId(getUniqueFormId());
		lostAndFound.persist();
		return true;
	}
	
	@RequestMapping(value = "/get",
			method = RequestMethod.GET)
	@ResponseBody
	public LostAndFound get() {
		LostAndFound lostAndFound = new LostAndFound();
		lostAndFound.setFormId(getUniqueFormId());
		lostAndFound.setCity("Astana");
		lostAndFound.setDeclarantName("declarantName1");
		lostAndFound.setLostDate(new Date());
		
		return lostAndFound;
	}
	
	public static String getUniqueFormId() {
		Date currentDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String uniqueFormId = "BN" + format.format(currentDate);

		logger.debug("Unique form Id retrieved: " + uniqueFormId);
		return uniqueFormId;
	}

}
