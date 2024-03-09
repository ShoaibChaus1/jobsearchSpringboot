package com.jobfind.services;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jobfind.entity.Jobs;
import com.jobfind.repository.JobRepo;

@Service
public class JobService
{
	@Autowired
    JobRepo jobRepo;
	
	public Jobs createNewJob(Jobs jobs)
	{
	  jobRepo.save(jobs);
	  return jobs;
	}
	
	
   public List<Jobs> getAllJobs()
   {
	   System.out.println(jobRepo.findAll());
	   return jobRepo.findAll();
   }
   
   public Optional<Jobs> getJobById(Long id)
   {
	  return jobRepo.findById(id);
   }
   
   public List<Jobs> search(String str,int id)
   {
	   Pageable pageble=PageRequest.of(id, 10);
	   List<Jobs> li= jobRepo.findAll(pageble).toList();
	   
	   System.out.println(li);
	 System.out.println(str);
	 List<Jobs> li1= li.stream().filter(x->x.getJobTitle().contains(str)||x.getJobDescription().contains(str) ).collect(Collectors.toList());
	  
	 return li1;
   }
   
   
   public String deleteById(long id)
   {
	   jobRepo.deleteById(id);
	   
	   return "Deleted...";
   }
   
   public Jobs update(Jobs job)
   {
	   jobRepo.save(job);
	   return job;
   }
   
   public List<Jobs> loadDataInPaginationByPageAndRows(int index)
   {
	   Pageable pageable=PageRequest.of(index, 10);
	   System.out.println("index :"+index);
	   return jobRepo.findAll(pageable).toList();
   }
   
   public int leangthOfData()
   {
	   return jobRepo.findAll().size() ;
   }
   
   
}
