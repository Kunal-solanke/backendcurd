package com.PODEcarePoc.Ecare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PODEcarePoc.Ecare.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
