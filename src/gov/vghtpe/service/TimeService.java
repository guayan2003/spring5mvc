package gov.vghtpe.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

	public TimeService() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTime() {
		return new Date().toString();
	}

}
