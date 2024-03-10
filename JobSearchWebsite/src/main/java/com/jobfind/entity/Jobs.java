package com.jobfind.entity;

import java.util.Arrays;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Jobs
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
	private String jobTitle;
	private String companyName;
	private int jobExperiance;
	private double jobSalary;
	private String jobLocation;
	private String jobDescription;
	private String[] jobSkills;

	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobs(long jobId, String jobTitle, String companyName, int jobExperiance, double jobSalary,
			String jobLocation, String jobDescription, String[] jobSkills) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.jobExperiance = jobExperiance;
		this.jobSalary = jobSalary;
		this.jobLocation = jobLocation;
		this.jobDescription = jobDescription;
		this.jobSkills = jobSkills;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getJobExperiance() {
		return jobExperiance;
	}

	public void setJobExperiance(int jobExperiance) {
		this.jobExperiance = jobExperiance;
	}

	public double getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(double jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String[] getJobSkills() {
		return jobSkills;
	}

	public void setJobSkills(String[] jobSkills) {
		this.jobSkills = jobSkills;
	}

	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", jobExperiance="
				+ jobExperiance + ", jobSalary=" + jobSalary + ", jobLocation=" + jobLocation + ", jobDescription="
				+ jobDescription + ", jobSkills=" + Arrays.toString(jobSkills) + "]";
	}
	
	
	

}
