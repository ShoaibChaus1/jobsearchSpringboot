package com.jobfind.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobfind.entity.Jobs;
import com.jobfind.services.JobService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class JobsController
{
	@Autowired
	JobService jobService;
   
	@PostMapping("/addJob")
	public Jobs addJob(@RequestBody Jobs job)
	{
		System.out.println(job);
		return jobService.createNewJob(job);
	}
	
	@GetMapping("/getJobs")
	public List<Jobs> getllJobs()
	{
	  return jobService.getAllJobs();
	}
	
	@GetMapping("/getJob/{id}")
	public Optional<Jobs> getJobById(@PathVariable("id")long id)
	{
		return jobService.getJobById(id);
	}
	
	@GetMapping("/search/{text}/{id}")
	public List<Jobs> searchByText(@PathVariable("text") String text,@PathVariable("id") int id)
	{
		System.out.println(text);
		System.out.println(id);
		return jobService.search(text,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") long id)
	{
		return jobService.deleteById(id);
		
	}
	
	@PutMapping("/update")
	public Jobs update(@RequestBody Jobs job)
	{
		return jobService.update(job);
	}
	
	@GetMapping("/length")
	public double getLengthOfList()
	{
		return jobService.leangthOfData();
	}
	
	@GetMapping("/pages/{index}")
	public List<Jobs> getJobsPages(@PathVariable("index") int index)
	{
		 return jobService.loadDataInPaginationByPageAndRows(index);
	}
}
