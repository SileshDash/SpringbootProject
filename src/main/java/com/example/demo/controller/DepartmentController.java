package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/get")
    public List<Department> getAllDepartment(){
        return departmentService.getAll();
    }
    @GetMapping("/get/{id}")
    public Department getById(@PathVariable("id") Long deptId){
        return departmentService.getbyId(deptId);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDepartmentByid(@PathVariable("id") Long deptId){
         departmentService.deleteDepartmentByid(deptId);
         return "Department Deleted sucessfully"+" "+deptId;
    }
    @PutMapping ("/update/{id}")
    public Department updateDepartmentByid(@PathVariable("id") Long deptId,@RequestBody Department department){
        return departmentService.updateDepartmentByid(deptId,department);

    }
}
