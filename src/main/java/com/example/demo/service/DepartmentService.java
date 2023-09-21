package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {


   public Department saveDepartment(Department department);

   public List<Department> getAll();

    public Department getbyId(Long deptId);


   public void deleteDepartmentByid(Long deptId);


   public Department updateDepartmentByid(Long deptId, Department department);


   public Department getDepartmentByName(String deptName);
}
