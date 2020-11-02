package com.example.mybatisplus;

import com.example.mybatisplus.entity.Employees;
import com.example.mybatisplus.mapper.EmployeesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Resource
    private EmployeesMapper employeesMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getAllEmployee(){
        List<Employees> employees = employeesMapper.selectList(null);
        System.out.println(employees.size());
    }

}
