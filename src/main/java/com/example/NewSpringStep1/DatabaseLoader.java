package com.example.NewSpringStep1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
//import org.springframework.data.rest.webmvc.BasePathAwareController;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final SurgeonRepository repository;
	
	@Autowired
	public DatabaseLoader(SurgeonRepository repository) {
		this.repository = repository;
		
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(" 1 new Surgeon Created");
		this.repository.save(new Surgeon("Dr-Banjo", "Ismal", "Monday", "a", "a", "Full", "1CARM", "HE", "Dr-Miram-O'Shea", "03/07/2020", "Nr-Amy-Walsh", "Nr-Sharon-Hill", "Nr-Shiela-Brick", "Nr-Bunny-Sheehan", "Nr-Karena-Quill", "ttt", "cccc"));
		this.repository.save(new Surgeon("Dr-O Connor","Francis","Tuesday","MorningSession","","","","HE","Dr-Anne-Shirely","06/07/2020","Nr-Amy-Walsh","Nr-Sharon-Hill","Nr-Shiela-Brick","Nr-Bunny-Sheehan","Nr-Karena-Quill","","3"));
		this.repository.save(new Surgeon("Dr-Buckley","Eoin","Friday","","","Full","1CARM","HE","Dr-Miram-O'Shea","11/07/2020","Nr-Amy-Walsh","Nr-Sharon-Hill","Nr-Shiela-Brick","Nr-Bunny-Sheehan","Nr-Karena-Quill","","2"));
		//System.out.println(" 2 new Surgeon Created");
	}
	
}
