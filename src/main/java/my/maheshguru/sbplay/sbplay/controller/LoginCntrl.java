package my.maheshguru.sbplay.sbplay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import my.maheshguru.sbplay.sbplay.service.LoginService;

@Controller
public class LoginCntrl {
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	/*@ResponseBody*/
	public String Showlogin(ModelMap model)
	{
		//model.put("name", name);
		//model.put("id", id);
//		String str="<html>\r\n" + 
//				"<head>\r\n" + 
//				"	<title></title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"<p><span style=\"font-family:comic sans ms,cursive;\"><u><strong>Hello EveryOne :)</strong></u></span></p>\r\n" + 
//				"</body>\r\n" + 
//				"</html>";
		
		//System.out.println("Name is "+ name);
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
		public String Postlogin(ModelMap model,@RequestParam String name,@RequestParam String password)
	{
		
		boolean validuser=service.validateUser(name, password);

		if(!validuser) {
			
			model.put("errorMessage", "Invalid Credentials");
			return "login";

		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

}
