package com.jobfind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobfind.entity.Jobs;

public interface JobRepo extends JpaRepository<Jobs , Long>
{

}
