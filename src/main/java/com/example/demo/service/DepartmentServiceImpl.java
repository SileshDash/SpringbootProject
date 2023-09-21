package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getbyId(Long deptId) {
        return departmentRepository.findById(deptId).get();
    }

    @Override
    public void deleteDepartmentByid(Long deptId) {
        departmentRepository.deleteById(deptId);
    }

    @Override
    public Department updateDepartmentByid(Long deptId, Department department) {
        Department deptDb = departmentRepository.findById(deptId).get();
        if (Objects.nonNull(department.getDeptName()) &&
                !"".equalsIgnoreCase(department.getDeptName())) {
            deptDb.setDeptName(department.getDeptName());
        }
        if (Objects.nonNull(department.getDeptAddress()) &&
         !"".equalsIgnoreCase(department.getDeptAddress())){
            deptDb.setDeptAddress(department.getDeptAddress());
        }
        if (Objects.nonNull(department.getDeptCode()) &&
        !"".equalsIgnoreCase(department.getDeptCode())){
            deptDb.setDeptCode(department.getDeptCode());
        }
        return departmentRepository.save(deptDb);
    }

    @Override
    public Department getDepartmentByName(String deptName) {
        return departmentRepository.findbyDeptName(deptName);
    }

}


