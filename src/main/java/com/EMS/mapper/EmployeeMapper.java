package com.EMS.mapper;

import com.EMS.Dto.EmployeeDto;
import com.EMS.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhoneNumber(),
                employee.getSalary(),
                employee.getDepartment(),
                employee.getLocation());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getPhoneNumber(),
                employeeDto.getSalary(),
                employeeDto.getDepartment(),
                employeeDto.getLocation());
    }

}
