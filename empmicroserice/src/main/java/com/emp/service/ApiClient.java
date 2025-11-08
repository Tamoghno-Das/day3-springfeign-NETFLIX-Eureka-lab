package com.emp.service;

import com.emp.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "https://localhost:8888" , value = "deptmicroserice")
@FeignClient(name = "deptmicroserice")
public interface ApiClient {
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
