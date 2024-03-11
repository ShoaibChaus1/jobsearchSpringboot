package com.jobfind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jobfind.services.JobService;

@SpringBootApplication
public class JobSearchWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSearchWebsiteApplication.class, args);
		
		
		//service.loadDataInPaginationByPageAndRows().forEach(System.out::println);
	}

}
