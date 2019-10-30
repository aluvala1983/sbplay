package my.maheshguru.sbplay.sbplay.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String uname,String pascode)
	{
				
		return uname.equalsIgnoreCase("Mahesh") && pascode.equalsIgnoreCase("password");
	}

}
