package com.work.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.work.model.*;
public interface employeeRepository extends JpaRepository<employee,String> {
	
}
