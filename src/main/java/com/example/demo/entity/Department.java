package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;

    public long getDeptId(Long deptId) {
        return this.deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Department(long deptId, String deptName, String deptAddress, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAddress = deptAddress;
        this.deptCode = deptCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptAddress='" + deptAddress + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
