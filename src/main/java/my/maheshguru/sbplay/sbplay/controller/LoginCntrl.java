package my.maheshguru.sbplay.sbplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginCntrl {
	
	@RequestMapping("/login")
	/*@ResponseBody*/
	public String login(@RequestParam String name,@RequestParam String id,ModelMap model)
	{
		model.put("name", name);
		model.put("id", id);
//		String str="<html>\r\n" + 
//				"<head>\r\n" + 
//				"	<title></title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"<p><span style=\"font-family:comic sans ms,cursive;\"><u><strong>Hello EveryOne :)</strong></u></span></p>\r\n" + 
//				"</body>\r\n" + 
//				"</html>";
		
		System.out.println("Name is "+ name);
		return "login";
	}

}
